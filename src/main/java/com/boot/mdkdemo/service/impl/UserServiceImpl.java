package com.boot.mdkdemo.service.impl;

import com.boot.mdkdemo.entity.User;
import com.boot.mdkdemo.mapper.UserMappers;
import com.boot.mdkdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private com.boot.mdkdemo.dao.userMapper userMapper;

    @Autowired
    private UserMappers userMappers;

    @Override
    public List<User> hello(){
        List<User> hello=null;
        try {
            hello = userMapper.hello();
        }catch (Exception e){
            e.printStackTrace();
        }
        return hello;
    }

    @Override
    public User selectById(Integer id) {
        User user=new User();
        user.setId(id);
        return  userMappers.selectOne(user);
    }


}
