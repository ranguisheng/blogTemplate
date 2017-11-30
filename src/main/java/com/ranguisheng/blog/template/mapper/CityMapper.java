package com.ranguisheng.blog.template.mapper;

import com.ranguisheng.blog.template.model.Hotel;
import org.apache.ibatis.annotations.Mapper;
/**
 * Created by guishengran on 2017/11/30.
 */
@Mapper
public interface CityMapper {
    Hotel selectCityById(int city_id);
}
