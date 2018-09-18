package com.remon.springboot2.dao;

import com.remon.springboot2.bean.Resource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ResourceDao {
    Resource getResourceById(@Param("id") long id);
    int updateResource(@Param("Rsrc") Resource Resource);
    int insertResource(@Param("Rsrc") Resource Resource);
    int deleteResource(@Param("Rsrc") long id);
    List<Resource> getResourcesByType(@Param("type") String type);
    List<Resource> getResources();
    List<Resource> getResourcesByNameAndType(@Param("name") String name,@Param("type") String type);
    List<Resource> getResourcesByCond(@Param("Rsrc") Resource Resource);
}
