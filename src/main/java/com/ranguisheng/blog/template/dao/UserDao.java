package com.ranguisheng.blog.template.dao;

import com.ranguisheng.blog.template.model.User;

public interface UserDao {
    /**
     * 根据id获取用户
     * @return
     */
    public User getUserById(long userId);
    
}
