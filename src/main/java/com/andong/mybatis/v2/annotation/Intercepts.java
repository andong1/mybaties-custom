package com.andong.mybatis.v2.annotation;

import java.lang.annotation.*;

/**
 * 用于注解拦截器，指定拦截的方法
 * @Author: andong
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Intercepts {
    String value();
}
