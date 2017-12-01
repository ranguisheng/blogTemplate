package com.ranguisheng.blog.template.mapper;

import com.ranguisheng.blog.template.model.City;
import org.apache.ibatis.annotations.Select;

/**
 * Created by guishengran on 2017/11/30.
 */
public interface CityMapper {list
    @Select("select * from city where id = #{id}")
    City selectCityById(int id);
}
