package com.remon.springboot2.service;

import com.remon.springboot2.bean.Resource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResourceService {
    Resource getResourceById(long id);
    int updateResource(Resource Resource);
    int insertResource(Resource Resource);
    int deleteResource(long id);
    List<Resource> getResourcesByType(String type);
    List<Resource> getResources();
    List<Resource> getResourcesByCond(String name,String type);
}
