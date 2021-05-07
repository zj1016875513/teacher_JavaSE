package com.atguigu.morningtest;

import java.util.ArrayList;
import java.util.Collection;

public class TestTwo {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        Collection collOne = new ArrayList();

        coll.size();// 返回当前集合中的元素数
        coll.add("Tom");// 将一个元素添加进集合
        coll.addAll(collOne);// 将一个集合中所有的元素添加进集合
        coll.contains("Tom");// 在集合中搜索是否存在参数元素，存在则返回true，否则返回false
        coll.containsAll(collOne);// 在集合中搜索是否存在参数集合中的所有元素，只要有一个不存在则返回false，必须全存在返回true
        coll.remove("Tom");// 将参数元素从集合中移除
        coll.removeAll(collOne);// 将参数集合中的所有元素从集合中移除
        coll.iterator();// 返回迭代当前集合的迭代器
        coll.isEmpty();// 判断当前集合是否为空
        coll.clear();// 清空集合中所有元素

    }
}
