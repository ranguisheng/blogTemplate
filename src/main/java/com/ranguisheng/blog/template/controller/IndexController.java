package com.ranguisheng.blog.template.controller;

import com.ranguisheng.blog.template.config.BlogTemplateConfig;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by guishengran on 2017/11/23.
 */
@RestController
public class IndexController {
    private static final Logger logger = Logger.getLogger(IndexController.class);
    @Autowired
    BlogTemplateConfig blogTemplateConfig;
    @RequestMapping("/")
    public String index(){
        logger.info(">>>>>>>>>>>>>>>>>web name:"+blogTemplateConfig.getName());
        return "Welcome to blog template:)";
    }
}
