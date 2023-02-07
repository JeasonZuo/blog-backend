package com.jeasonzuo.dao;

import com.jeasonzuo.domain.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PostDao {
    @Select("select * from post where id = #{id}")
    public Post getById(Integer id);
}
