package com.ranguisheng.blog.template.jpaconfig.s;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 用户model
 */
@Entity
public class User1 {
    @Id
    @GeneratedValue
    private long id;
    //用户id
    @Column(nullable = false)
    private long userId;
    //手机号
    @Column
    private long mobile;
    //邮箱地址
    @Column(nullable = false)
    private String mail;
    //昵称
    @Column
    private String nickName;
    //用户名
    @Column(nullable = false)
    private String userName;
    public User1(){}
    public User1(long userId,long mobile,String mail,String nickName,String userName){
        this.userId = userId;
        this.mail = mail;
        this.mobile = mobile;
        this.nickName = nickName;
        this.userName = userName;
    }
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
