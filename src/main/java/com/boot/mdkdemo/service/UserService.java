package com.boot.mdkdemo.service;

import com.boot.mdkdemo.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    List<User> hello();

    User selectById(Integer id);
}
