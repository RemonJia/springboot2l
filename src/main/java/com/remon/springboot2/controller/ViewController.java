package com.remon.springboot2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    private Logger log = LoggerFactory.getLogger(ViewController.class);
    //登录页面
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    //登录动作
    @RequestMapping("/index")
    public String logon(){
        log.info("登录成功");
        return "index";
    }
    //注销（登出）
    @RequestMapping("/logout")
    public String logout(){
        return "login";
    }
}
