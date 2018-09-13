package com.remon.springboot2.service.impl;

import com.remon.springboot2.bean.User;
import com.remon.springboot2.dao.UserDao;
import com.remon.springboot2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByName(String username) {
        return userDao.getUserByUsername(username);
    }
}
