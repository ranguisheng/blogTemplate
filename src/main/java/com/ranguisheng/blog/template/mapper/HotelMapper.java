package com.ranguisheng.blog.template.mapper;

import com.ranguisheng.blog.template.model.Hotel;

/**
 * Created by guishengran on 2017/11/30.
 */
@Mapper
public interface HotelMapper {
    Hotel selectByCityId(int city_id);
}
