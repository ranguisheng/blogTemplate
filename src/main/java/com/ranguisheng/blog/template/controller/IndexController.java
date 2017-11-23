package com.ranguisheng.blog.template.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guishengran on 2017/11/23.
 */
@RestController
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "Welcome to blog template:)";
    }
}
