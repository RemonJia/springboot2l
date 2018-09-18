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
    /**
     * 实体列表查询
     * */
    @RequestMapping("/entity")
    public String entity(Model m){
        List entitys = entityService.getEntitys();
        m.addAttribute("entitys",entitys);
        return "entity_list";
    }

    /**
     * 条件查询
     * @param search_ettname
     * @param search_ettcode
     * @param m
     * @return
     */
    @RequestMapping("/fetch")
    public String fetch(@RequestParam("search_ettname")String search_ettname
            ,@RequestParam("search_ettcode")String search_ettcode
            ,Model m){
        List entitys = entityService.getEntitysByName(search_ettname,search_ettcode);
        m.addAttribute("entitys",entitys);
        m.addAttribute("search_ettname",search_ettname);
        m.addAttribute("search_ettcode",search_ettcode);
        return "entity_list";
    }

    /**
     * 编辑页面
     * @param eid
     * @param m
     * @return
     */
    @RequestMapping("/entityEdit")
    public String entityEdit(@RequestParam(value="eid",required=false) String eid, Model m){
        if (!StringUtils.isEmpty(eid)){
            m.addAttribute("curr_entityid",eid);
        }
        return "entity_edit";
    }

    /**
     * 删除实体
     * @param eid
     * @param m
     * @return
     */
    @RequestMapping("/entityDel")
    public String entityDel(@RequestParam(value="eid",required=false) String eid, Model m){
        if (!StringUtils.isEmpty(eid)){
            m.addAttribute("curr_entityid",eid);
            entityService.deleteEntity(Long.parseLong(eid));
        }
        return entity(m);
    }

    /**
     * （上下文）实体模型注册
     * @return
     */
    @ModelAttribute(value="myEntity")
    public Entity newEntity(){
        Entity e = new Entity();
        return  e;
    }

    /**
     * 保存实体
     * @param entity
     * @return
     */
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
