package com.ranguisheng.blog.template.controller;

import com.ranguisheng.blog.template.config.WebConfig;
import com.ranguisheng.blog.template.utils.DBHelpUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * Created by guishengran on 2017/11/23.
 */
@RestController
public class IndexController {
    private static final Logger logger = Logger.getLogger(IndexController.class);
    @Autowired
    WebConfig webConfig;

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    private JdbcTemplate jdbcTemplate1;

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    private JdbcTemplate jdbcTemplate2;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        logger.info("print primarydatasource user table......");
        String sql = "select * from user";
        List<Map<String,Object>> list = jdbcTemplate1.queryForList(sql);
        DBHelpUtil.tableInfoPrinter(list);
        logger.info("print secondarydatasource user table......");
        String sql1 = "select * from user";
        List<Map<String,Object>> list1 = jdbcTemplate2.queryForList(sql1);
        DBHelpUtil.tableInfoPrinter(list1);
        return "Welcome to blog template:)";
    }
}
