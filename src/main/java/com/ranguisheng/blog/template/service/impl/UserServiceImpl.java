package com.ranguisheng.blog.template.service.impl;

import com.ranguisheng.blog.template.jpaconfig.p.User;
import com.ranguisheng.blog.template.jpaconfig.p.UserRepository;
import com.ranguisheng.blog.template.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

/**
 * Created by guishengran on 2017/11/28.
 */
public class UserServiceImpl implements IUserService{
    private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
    @Autowired
    private UserRepository userRepository;

    @Cacheable(value="User-key")
    @Override
    public User getUser() {
        User user = userRepository.findOne(123L);
        logger.info("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }
}
