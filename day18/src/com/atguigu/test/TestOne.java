package com.atguigu.test;

import java.util.HashMap;
import java.util.Map;

public class TestOne {
    public static void main(String[] args) {
        // HashMap在创建对象时不会为哈希表初始化长度，仅对加载因子进行赋值，默认值为0.75
        // HashMap底层存储数据的哈希表初始化容量为16，在当前元素数超过数组长度*负载因此时扩容，按照原长度两个库容
        // 哈希表一旦扩容则将所有原元素重新打散。
        Map map = new HashMap();

        // 当元素放入HashMap集合中时，会调用键值对当中的键，按照键的hashCode方法来确定当前键值对在哈希表中的索引。
        // 如果该索引处无元素，则将键值对象存储在该索引处，如果该索引处有元素则调用equals方法判断新键和老键是否相等
        // 如果equals返回true，则不执行添加动作，如果equals方法返回false，则将新键值对链接到老键值对的next属性。
        // 从jdk1.8开始，如果一个链表的元素达到8个则判断当前哈希表是否长度超过64，如果没超过64，则扩容，重新打散数据。
        // 如果数组此时已经超过64，则将链表结构变换称为红黑树结构，jdk1.8之前哈希表为数组+链表，jdk1.8之后哈希表为数组+链表+红黑树
        map.put("","");
    }
}
