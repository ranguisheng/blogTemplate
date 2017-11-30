package com.ranguisheng.blog.template.mapper;

import com.ranguisheng.blog.template.model.Hotel;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by guishengran on 2017/11/30.
 */
public interface HotelMapper {
    @Select("select * from hotel where city = #{id}")
    @Results({@Result(property = "city",column = "city")})
    List<Hotel> selectHotelByCityId(int id);
}
