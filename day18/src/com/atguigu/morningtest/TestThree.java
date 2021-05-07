package com.atguigu.morningtest;

import java.util.*;

public class TestThree {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("班长","美国");// put方法用于将键值对元素存入到集合中，两个参数，前键后值
        map.put("学委","中国");
        map.put("体委","俄罗斯");
        map.put("文委","意大利");

        System.out.println(map.get("文委"));// get方法用于将元素从集合中取出，参数是键，返回是值。

        map.remove("体委");// 使用键作为参数移除整个键值对

        System.out.println(map.containsKey("学委"));// 在集合中搜索参数键，如果存在则返回true，不存在则返回false

        map.isEmpty();// 返回集合是否为空

//        map.clear();// 清空集合

        map.size();// 返回当前集合的元素数

        Set keys = map.keySet();// 返回map集合的键集
        System.out.println(keys);

        Collection values = map.values();// 返回map集合中的值集
        System.out.println(values);

        Set entrySet = map.entrySet();// 返回map集合中的键值对集
        System.out.println(entrySet);
    }
}
