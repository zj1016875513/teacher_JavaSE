package com.atguigu.morningtest;

import java.util.*;

public class TestOne {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("班长","小明");// 将键值对添加进集合
        String s = map.get("班长");// 使用键将值取出
        map.remove("班长");// 使用键做参数，移除整个键值对
        map.containsKey("班长");// 返回当前集合中是否存在该键
        map.containsValue("小明");// 返回当前集合中是否存在该值
        map.size();// 当前集合中的键值对数
        map.isEmpty();// 判断当前集合是否为空
        map.clear();// 清空当前集合
        Set<String> keys = map.keySet();// 返回当前集合中的键集
        Collection<String> col = map.values();// 返回当前集合中的值集
        Set<Map.Entry<String,String>> set = map.entrySet();// 返回当前集合中的键值对集
    }
}
