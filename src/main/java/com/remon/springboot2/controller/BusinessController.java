package com.remon.springboot2.controller;

import com.remon.springboot2.bean.Entity;
import com.remon.springboot2.service.EntityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/b")
public class BusinessController {

    private Logger log = LoggerFactory.getLogger(BusinessController.class);

    @Autowired
    EntityService entityService;

    @RequestMapping("/entity")
    public String entity(Model m){
        List entitys = entityService.getEntitys();
        m.addAttribute("entitys",entitys);
        return "entity_list";
    }
    @RequestMapping("/fetch")
    public String fetch(@RequestParam("search_ettname")String search_ettname
            ,@RequestParam("search_ettcode")String search_ettcode
            ,Model m){
        List entitys = entityService.getEntitysByName(search_ettname,search_ettcode);
        m.addAttribute("entitys",entitys);
        return "entity_list";
    }

    @RequestMapping("/entity_edit")
    public String entityEdit(@RequestParam("eid") String eid, Model m){
        if (!StringUtils.isEmpty(eid)){
            m.addAttribute("curr_entityid",eid);
        }
        return "entity_edit";
    }
    @ModelAttribute(value="myEntity")
    public Entity newEntity(){
        Entity e = new Entity();
        return  e;
    }

    @RequestMapping("/saveEntity")
    public String saveEntity(@ModelAttribute("myEntity") Entity entity){
        log.info(entity.getEntityname());
        if (StringUtils.isEmpty(entity.getEntityid()))
            entityService.insertEntity(entity);
        else
            entityService.updateEntity(entity);
        return "entity_edit";
    }

}
