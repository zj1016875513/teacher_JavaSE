package com.atguigu.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestFour {
    public static void main(String[] args) {
        // LinkedHashSet的新增顺序和遍历顺序一致
        Set set = new LinkedHashSet();

        set.add("苹果");
        set.add("西瓜");
        set.add("香蕉");
        set.add("芒果");
        set.add("橘子");


        for (Object o : set) {
            System.out.println(o);
        }
    }
}
