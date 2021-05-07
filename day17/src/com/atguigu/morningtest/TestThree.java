package com.atguigu.morningtest;

import java.util.ArrayList;
import java.util.List;

public class TestThree {
    public static void main(String[] args) {
        List list = new ArrayList();
        List listOne = new ArrayList();

        // list两个参数的添加方法，第一个参数是元素添加的索引位置，第二个参数是元素
        // 第一个参数的索引位置不能大于当前list的size()
        // 在执行添加后，size()会加1，插入位置原元素及以后元素，向后移动一位
        list.add(1,"Tom");
        // 将第二个参数集合，在指定的第一个参数的索引位置开始，全部添加进集合
        // 原索引位置的元素及后续元素要在添加集合的最后一个元素的后面向后移动
        list.addAll(1,listOne);
        // 利用索引，获取单个元素
        Object obj = list.get(0);
        // remove使用索引作为参数，将索引位置的元素从集合中移除
        // 这个方法用于有比以元素为参数移除的方法更高的优先级
        list.remove(1);
        // 使用第二个参数元素，替换掉集合第一个参数索引位置的原元素，方法执行后，size不会改变
        list.set(1,"Jerry");
    }
}
