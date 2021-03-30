package com.andong.mybatis.v1;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;

/**
 * @Author: andong
 */
public class AdConfiguration {
    public static final ResourceBundle sqlMappings;

    static{
        sqlMappings = ResourceBundle.getBundle("sql1");
    }

    public <T> T getMapper(Class clazz, AdDefaultSqlSession sqlSession) {
        return (T)Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{clazz},
                new AdMapperProxy(sqlSession));
    }


}
