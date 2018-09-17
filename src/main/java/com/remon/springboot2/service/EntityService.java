package com.remon.springboot2.service;

import com.remon.springboot2.bean.Entity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EntityService {
    Entity getEntityById(@Param("id") long id);
    int updateEntity(@Param("ett") Entity entity);
    int insertEntity(@Param("ett") Entity entity);
    int deleteEntity(@Param("ett") long id);
    List<Entity> getEntitysByName(@Param("name") String name);
    List<Entity> getEntitys();
}
