package com.remon.springboot2.controller;

import com.alibaba.fastjson.JSONObject;
import com.remon.springboot2.bean.Resource;
import com.remon.springboot2.service.ResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResourceController {
    private Logger log = LoggerFactory.getLogger(ResourceController.class);

    @Autowired
    private ResourceService rssService;

    @RequestMapping(value = "/loadMenu",method = RequestMethod.GET)
    public String loadMenu(String resourceType){
        List<Resource> list = rssService.getResourcesByType(resourceType);
        String json = JSONObject.toJSONString(list);
        return json;
    }
    @RequestMapping("/loadOne")
    public String loadOne(){
        Resource r = rssService.getResourceById(2);
        String json = JSONObject.toJSONString(r);
        return json;
    }
}
