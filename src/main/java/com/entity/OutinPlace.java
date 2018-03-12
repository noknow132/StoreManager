package com.entity;

import java.util.Date;

public class OutinPlace {
    private String id;

    private String name;

    private Integer placeNo;

    private String createstorehouseId;

    private String createstoreareaId;

    private Integer type;

    private Integer placeHeight;

    private Integer placeColumn;

    private String outNo;

    private Date editDate;

    private Integer isUsed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPlaceNo() {
        return placeNo;
    }

    public void setPlaceNo(Integer placeNo) {
        this.placeNo = placeNo;
    }

    public String getCreatestorehouseId() {
        return createstorehouseId;
    }

    public void setCreatestorehouseId(String createstorehouseId) {
        this.createstorehouseId = createstorehouseId == null ? null : createstorehouseId.trim();
    }

    public String getCreatestoreareaId() {
        return createstoreareaId;
    }

    public void setCreatestoreareaId(String createstoreareaId) {
        this.createstoreareaId = createstoreareaId == null ? null : createstoreareaId.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPlaceHeight() {
        return placeHeight;
    }

    public void setPlaceHeight(Integer placeHeight) {
        this.placeHeight = placeHeight;
    }

    public Integer getPlaceColumn() {
        return placeColumn;
    }

    public void setPlaceColumn(Integer placeColumn) {
        this.placeColumn = placeColumn;
    }

    public String getOutNo() {
        return outNo;
    }

    public void setOutNo(String outNo) {
        this.outNo = outNo == null ? null : outNo.trim();
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public Integer getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
    }
}