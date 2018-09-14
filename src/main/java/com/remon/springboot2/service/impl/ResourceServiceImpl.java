package com.remon.springboot2.service.impl;

import com.remon.springboot2.bean.Resource;
import com.remon.springboot2.dao.ResourceDao;
import com.remon.springboot2.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceDao dao;

    @Override
    public Resource getResourceById(long id) {
        return dao.getResourceById(id);
    }

    @Override
    public int updateResource(Resource resource) {
        return dao.updateResource(resource);
    }

    @Override
    public int insertResource(Resource resource) {
        return dao.insertResource(resource);
    }

    @Override
    public int deleteResource(long id) {
        return dao.deleteResource(id);
    }

    @Override
    public List<Resource> getResourcesByType(String type) {
        return dao.getResourcesByType(type);
    }
}
