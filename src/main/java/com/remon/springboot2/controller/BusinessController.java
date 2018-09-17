package com.remon.springboot2.controller;

import com.remon.springboot2.bean.Entity;
import com.remon.springboot2.service.EntityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BusinessController {

    private Logger log = LoggerFactory.getLogger(BusinessController.class);

    @Autowired
    EntityService entityService;

    @RequestMapping("/b/entity")
    public String entity(Model mv){
        List entitys = entityService.getEntitys();
        mv.addAttribute("entitys",entitys);
        return "entity_list";
    }
    @RequestMapping("/b/entity_edit")
    public String entityEdit(Model m){
//        m.addAttribute("entity",new Entity());
        return "entity_edit";
    }
    @ModelAttribute(value="myEntity")
    public Entity newEntity(){
        Entity e = new Entity();
        return  e;
    }

    @RequestMapping("/b/saveEntity")
    public String saveEntity(@ModelAttribute("myEntity") Entity entity){
        log.info(entity.getEntityname());
        entityService.insertEntity(entity);
        return "entity_edit";
    }
}
