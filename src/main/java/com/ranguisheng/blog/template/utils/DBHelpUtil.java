package com.ranguisheng.blog.template.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 数据库帮助类
 */
public class DBHelpUtil {
    /**
     * 打印一张表里所有数据
     * @param list
     */
    public static void tableInfoPrinter(List<Map<String,Object>> list){
        for(Map<String,Object> map:list){
            Set<Map.Entry<String,Object>> entries = map.entrySet();
            if(entries != null){
                Iterator<Map.Entry<String,Object>> iterator = entries.iterator();
                while (iterator.hasNext()){
                    Map.Entry<String, Object> entry =(Map.Entry<String, Object>) iterator.next( );
                    Object key = entry.getKey( );
                    Object value = entry.getValue();
                    System.out.println(key+":"+value);
                }
            }
        }
    }
}
