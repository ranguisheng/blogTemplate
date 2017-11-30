package com.ranguisheng.blog.template.test;

import com.ranguisheng.blog.template.mapper.CityMapper;
import com.ranguisheng.blog.template.mapper.HotelMapper;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by guishengran on 2017/11/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MybatisTest {
    private static final Logger logger = Logger.getLogger(MybatisTest.class);
    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private HotelMapper hotelMapper;
    @Test
    public void testMybatis(){
        logger.info(this.cityMapper.selectCityById(1)+ "");
        logger.info(this.hotelMapper.selectHotelByCityId(1)+ "");
    }
}
