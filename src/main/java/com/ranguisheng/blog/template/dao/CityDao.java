package com.ranguisheng.blog.template.dao;

import com.ranguisheng.blog.template.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by guishengran on 2017/11/30.
 */
@Component
public class CityDao {
    @Autowired
    private SqlSession sqlSession;

    public City selectCityById(long id) {
        return this.sqlSession.selectOne("selectCityById", id);
    }
}
