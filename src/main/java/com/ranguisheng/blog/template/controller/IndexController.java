package com.ranguisheng.blog.template.controller;

import com.ranguisheng.blog.template.config.BlogTemplateConfig;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Created by guishengran on 2017/11/23.
 */
@RestController
public class IndexController {
    private static final Logger logger = Logger.getLogger(IndexController.class);
    @Autowired
    BlogTemplateConfig blogTemplateConfig;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        //测试查询数据库
        String sql = "select * from user";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        for(Map<String,Object> map:list){
            Set<Map.Entry<String,Object>> entries = map.entrySet();
            if(entries != null){
                Iterator<Map.Entry<String,Object>> iterator = entries.iterator();
                while (iterator.hasNext()){
                    Map.Entry<String, Object> entry =(Map.Entry<String, Object>) iterator.next( );
                    Object key = entry.getKey( );
                    Object value = entry.getValue();
                    System.out.println(key+":"+value);
                }
            }
        }
        return "Welcome to blog template:)";
    }
}
