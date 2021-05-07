package com.atguigu.morningtest;

public class Goods {
    private int goodsId;
    private String goodsName;
    private double goodsPrice;
    private int goodsNum;
    private Type type;

    public Goods() {
    }

    public Goods(int goodsId, String goodsName, double goodsPrice, int goodsNum, Type type) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsNum = goodsNum;
        this.type = type;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
