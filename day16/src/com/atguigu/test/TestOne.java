package com.atguigu.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestOne {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        Collection colOne = new ArrayList();
        colOne.add("小明");
        colOne.add("小强");

        System.out.println(col.size());// 当前集合中的元素数
        col.add("Tom");// 将元素添加到集合当中
        col.add("Jack");
        col.add("Mary");
        System.out.println(col.size());
//        System.out.println(col);
        col.addAll(colOne);// 一次添加一个整个集合中的所有元素
        System.out.println(col.size());
        // col.remove("Tom");// 将参数从集合中移除
        // System.out.println(col);
        // System.out.println(col.size());
        // col.clear();// 将集合中所有的元素移除，清空集合
        System.out.println(col.isEmpty());// 当前集合中是否为空，有元素返回false，无元素返回true。
        System.out.println(col.contains("June"));// 当前集合中是否包含参数元素，包含返回true，不包含返回false
        col.remove("小明");
        System.out.println(col.containsAll(colOne));// 返回当前集合中是否包含参数集合中的所有元素，包含所有元素返回true，有一个元素不包含返回false。
        System.out.println("-----------------------------");
        System.out.println(col);

        // 获取迭代器对象
        Iterator iter = col.iterator();// 哪个集合调用iterator方法，获取的迭代器对象就用于遍历那个集合

        while(iter.hasNext()){
            Object obj = iter.next();// next方法返回集合中的对象
            String s = (String)obj;
            System.out.println(s);
        }
        System.out.println("---------------------------");
        for(Object o : col){
            String s = (String)o;
            System.out.println(s);
        }

    }
}
