package com.remon.springboot2.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MsController {
    @RequestMapping("/home")
    public String login(){
        return "home";
    }



}
