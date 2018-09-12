package com.remon.springboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    //登录页面
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    //登录动作
    @RequestMapping("/logon")
    public String logon(){
        return "hello";
    }
    //注销（登出）
    @RequestMapping("/logout")
    public String logout(){
        return "login";
    }
}
