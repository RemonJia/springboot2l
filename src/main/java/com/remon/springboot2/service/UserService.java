package com.remon.springboot2.service;


import com.remon.springboot2.bean.User;

public interface UserService {
    public User findUserByName(String username);
}
