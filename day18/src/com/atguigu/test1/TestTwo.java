package com.atguigu.test1;

import java.util.HashSet;
import java.util.Set;

public class TestTwo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("苹果");
        set.add("香蕉");
        set.add("西瓜");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
