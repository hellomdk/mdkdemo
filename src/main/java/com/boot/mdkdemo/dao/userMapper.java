package com.boot.mdkdemo.dao;

import com.boot.mdkdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface userMapper {
    List<User> hello() throws Exception;

    @Select("select id,name from user where id=#{id}")
    public User getUserById(String id);
}
