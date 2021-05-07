package com.atguigu.morningtest;

public class GoodsTools {

    public static void showGoods(Goods goods){
        System.out.println("商品编号："+goods.getGoodsId()
                +",商品名称："+goods.getGoodsName()
                +",商品单价："+goods.getGoodsPrice()
                +",商品库存："+goods.getGoodsNum()
                +",商品分类："+ goods.getType().getInfo());
    }

}
