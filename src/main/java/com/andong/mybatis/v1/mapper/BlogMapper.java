package com.andong.mybatis.v1.mapper;

import com.andong.mybatis.v2.annotation.Entity;
import com.andong.mybatis.v2.annotation.Select;

/**
 * @Author: andong
 */
@Entity(Blog.class)
public interface BlogMapper {
    /**
     * 根据主键查询文章
     * @param bid
     * @return
     */
    @Select("select * from blog where bid = ? ")
    public Blog selectBlogById(Integer bid);

}
