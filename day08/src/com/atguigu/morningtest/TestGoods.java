package com.atguigu.morningtest;

public class TestGoods {
    public static void main(String[] args) {
        Type type = new Type(2,"休闲食品",2);
        Goods goods = new Goods(1,"旺仔牛奶",5.5,1000,type);
        // GoodsTools gt = new GoodsTools();
        // gt.showGoods(goods);
        GoodsTools.showGoods(goods);
    }
}
