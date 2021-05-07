package com.atguigu.morningtest;

public class Type {
    private int typeId;
    private String typeName;
    private int typeLevel;

    public Type() {
    }

    public Type(int typeId, String typeName, int typeLevel) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeLevel = typeLevel;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getTypeLevel() {
        return typeLevel;
    }

    public void setTypeLevel(int typeLevel) {
        this.typeLevel = typeLevel;
    }

    public String getInfo(){
        return "商品分类编号："+typeId+",商品分类名称："+typeName+",商品分类等级："+typeLevel;
    }
}
