package com.andong.mybatis.v1;

import com.andong.mybatis.v1.mapper.BlogMapper;

/**
 * @Author: andong
 */
public class MyBatisBoot {
    public static void main(String[] args) {
        AdDefaultSqlSession sqlSession = new AdDefaultSqlSession(new AdConfiguration(), new AdExecutor());
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        blogMapper.selectBlogById(1);
    }
}
