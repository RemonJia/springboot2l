package com.remon.springboot2.bean;

public class Resource {
    private Long resourceID;
    private Long parentID;
    private String accessPath;
    private boolean checked;
    private boolean delFlag;
    private String resourceCode;
    private String resourceDesc;
    private String resourceName;
    private  int resourceGrade;
    private  int resourceOrder;
    private  String resourceType;

    public Long getResourceID() {
        return resourceID;
    }

    public void setResourceID(Long resourceID) {
        this.resourceID = resourceID;
    }

    public Long getParentID() {
        return parentID;
    }

    public void setParentID(Long parentID) {
        this.parentID = parentID;
    }

    public String getAccessPath() {
        return accessPath;
    }

    public void setAccessPath(String accessPath) {
        this.accessPath = accessPath;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean isDelFlag() {
        return delFlag;
    }

    public void setDelFlag(boolean delFlag) {
        this.delFlag = delFlag;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourceDesc() {
        return resourceDesc;
    }

    public void setResourceDesc(String resourceDesc) {
        this.resourceDesc = resourceDesc;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public int getResourceGrade() {
        return resourceGrade;
    }

    public void setResourceGrade(int resourceGrade) {
        this.resourceGrade = resourceGrade;
    }

    public int getResourceOrder() {
        return resourceOrder;
    }

    public void setResourceOrder(int resourceOrder) {
        this.resourceOrder = resourceOrder;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
