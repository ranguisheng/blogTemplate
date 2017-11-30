package com.ranguisheng.blog.template.test;

import com.alibaba.fastjson.JSON;
import com.ranguisheng.blog.template.jpaconfig.primary.User;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;

/**
 * Created by guishengran on 2017/11/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestRedis {
    private static final Logger logger = Logger.getLogger(TestRedis.class);
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void test(){
        stringRedisTemplate.opsForValue().set("aaa","111");
        Assert.assertEquals("111",stringRedisTemplate.opsForValue().get("aaa"));
    }
    @Test
    public void testObj() throws InterruptedException {
        User user = new User(12345678912L,13426314655L,"vicyien@yeah.net",null,"ranguisheng2");
        ValueOperations<String,User> operations = redisTemplate.opsForValue();
        operations.set("com.neox",user);
        operations.set("com.neox.f",user,1, TimeUnit.SECONDS);
        User user1 = operations.get("com.neox");
        logger.info("user:"+ JSON.toJSONString(user1));
        Thread.sleep(1000);
        boolean exists = redisTemplate.hasKey("com.neox.f");
        if(exists){
            logger.info("exists is true");
        }else{
            logger.info("exists is false");
        }
    }
}
