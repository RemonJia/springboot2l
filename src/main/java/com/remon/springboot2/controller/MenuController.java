package com.remon.springboot2.controller;

import com.remon.springboot2.service.EntityService;
import com.remon.springboot2.service.ResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {

    private Logger log = LoggerFactory.getLogger(MenuController.class);

    @Autowired
    ResourceService resourceService;
    /**
     * 实体列表查询
     * */
    @RequestMapping("/menu")
    public String menu(Model m){
        List menus = resourceService.getResources();
        m.addAttribute("menus",menus);
        m.addAttribute("rootMenu",resourceService.getRootResources());
        return "menu_list";
    }

    /**条件查询
     *
     * @param search_menuname
     * @param search_menutype
     * @param m
     * @return
     */
    @RequestMapping("/fetch")
    public String fetch(@RequestParam("search_menuname")String search_menuname
            ,@RequestParam("search_menutype")String search_menutype
            ,Model m){
        List menus = resourceService.getResourcesByCond(search_menuname,search_menutype);
        m.addAttribute("menus",menus);
        m.addAttribute("search_menuname",search_menuname);
        m.addAttribute("search_menutype",search_menutype);
        return "menu_list";
    }
}
