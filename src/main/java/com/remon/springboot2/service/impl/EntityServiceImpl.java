package com.remon.springboot2.service.impl;

import com.remon.springboot2.bean.Entity;
import com.remon.springboot2.dao.EntityDao;
import com.remon.springboot2.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityServiceImpl implements EntityService {

    @Autowired
    private EntityDao entityDao;

    @Override
    public Entity getEntityById(long id) {
        return entityDao.getEntityById(id);
    }

    @Override
    public int updateEntity(Entity entity) {
        return entityDao.updateEntity(entity);
    }

    @Override
    public int insertEntity(Entity entity) {
        return entityDao.insertEntity(entity);
    }

    @Override
    public int deleteEntity(long id) {
        return entityDao.deleteEntity(id);
    }

    @Override
    public List<Entity> getEntitysByName(String name) {
        return entityDao.getEntitysByName(name);
    }

    @Override
    public List<Entity> getEntitysByName(String name, String code) {
        return entityDao.getEntitysByFuzzy(name,code);
    }

    @Override
    public List<Entity> getEntitys() {
        return entityDao.getEntitys();
    }
}
