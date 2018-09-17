package com.remon.springboot2.bean;

public class Entity {
    private Long entityid;
    private String entityname;
    private String entitycode;
    private Integer isdel;

    public Long getEntityid() {
        return entityid;
    }

    public void setEntityid(Long entityid) {
        this.entityid = entityid;
    }

    public String getEntityname() {
        return entityname;
    }

    public void setEntityname(String entityname) {
        this.entityname = entityname;
    }

    public String getEntitycode() {
        return entitycode;
    }

    public void setEntitycode(String entitycode) {
        this.entitycode = entitycode;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}
