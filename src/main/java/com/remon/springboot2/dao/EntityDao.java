package com.remon.springboot2.dao;

import com.remon.springboot2.bean.Entity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EntityDao {
    Entity getEntityById(@Param("id") long id);
    int updateEntity(@Param("ett") Entity entity);
    int insertEntity(@Param("ett") Entity entity);
    int deleteEntity(@Param("ett") long id);
    List<Entity> getEntitysByName(@Param("name") String name);
    List<Entity> getEntitysByFuzzy(@Param("name") String name,@Param("code") String code);
    List<Entity> getEntitys();
}
