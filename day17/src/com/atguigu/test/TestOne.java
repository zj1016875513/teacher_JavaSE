package com.atguigu.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestOne {
    public static void main(String[] args) {
        // Set接口特点：无序(新增顺序和遍历顺序不一致)，不允许元素重复

        Set set = new HashSet();
        System.out.println(set.size());
        set.add("Mary");
        set.add("Jerry");
        set.add("Rose");
        set.add("Jack");
        set.add("Tom");
        System.out.println(set.size());
        set.add("Tom");
        set.add("Tom");
        set.add("Tom");
        System.out.println(set.size());

        Iterator iter = set.iterator();
        while(iter.hasNext()){
            String s = (String)iter.next();
            System.out.println(s);
        }
    }
}
