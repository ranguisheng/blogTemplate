package com.ranguisheng.blog.template.test;

import com.ranguisheng.blog.template.jpaconfig.primary.User;
import com.ranguisheng.blog.template.jpaconfig.primary.UserRepository;
import com.ranguisheng.blog.template.jpaconfig.secondary.User1;
import com.ranguisheng.blog.template.jpaconfig.secondary.User1Repository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JpaTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private User1Repository user1Repository;

    @Test
    public void test() throws Exception {
        userRepository.deleteAll();
        userRepository.save(new User(12345678912L,13426314655L,"vicyien@yeah.net",null,"ranguisheng2"));
        userRepository.save(new User(12345678913L,13426314656L,"vicyien@yeah.net",null,"ranguisheng3"));
        userRepository.save(new User(12345678914L,13426314657L,"vicyien@yeah.net",null,"ranguisheng4"));
        userRepository.save(new User(12345678915L,13426314658L,"vicyien@yeah.net",null,"ranguisheng5"));
        userRepository.save(new User(12345678916L,13426314659L,"vicyien@yeah.net",null,"ranguisheng6"));
        Assert.assertEquals(5, userRepository.findAll().size());

        user1Repository.deleteAll();
        user1Repository.save(new User1(12345678912L,13426314655L,"vicyien@yeah.net",null,"ranguisheng2"));
        user1Repository.save(new User1(12345678913L,13426314656L,"vicyien@yeah.net",null,"ranguisheng3"));
        user1Repository.save(new User1(12345678914L,13426314657L,"vicyien@yeah.net",null,"ranguisheng4"));
        user1Repository.save(new User1(12345678915L,13426314658L,"vicyien@yeah.net",null,"ranguisheng5"));
        user1Repository.save(new User1(12345678916L,13426314659L,"vicyien@yeah.net",null,"ranguisheng6"));
        Assert.assertEquals(5, user1Repository.findAll().size());

    }
}
