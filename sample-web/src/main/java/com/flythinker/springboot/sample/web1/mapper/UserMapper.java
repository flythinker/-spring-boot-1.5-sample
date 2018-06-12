package com.flythinker.springboot.sample.web1.mapper;

import com.flythinker.springboot.sample.web1.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 黄奕鹏（大鹏~飞翔理念）,创建于 2018/6/11.
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USER WHERE id = #{id}")
    public User getUserById(@Param("id") Long id);
}
