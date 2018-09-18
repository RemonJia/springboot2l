package com.remon.springboot2.service;

import com.remon.springboot2.bean.Entity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EntityService {
    Entity getEntityById(long id);
    int updateEntity(Entity entity);
    int insertEntity(Entity entity);
    int deleteEntity(long id);
    List<Entity> getEntitysByName(String name);
    List<Entity> getEntitysByName(String name,String code);
    List<Entity> getEntitys();
}
