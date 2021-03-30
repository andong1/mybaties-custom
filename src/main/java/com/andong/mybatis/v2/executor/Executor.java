package com.andong.mybatis.v2.executor;

/**
 * @Author: andong
 */
public interface Executor {
    <T> T query(String statement, Object[] parameter, Class pojo);
}
