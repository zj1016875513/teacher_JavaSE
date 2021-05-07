package com.atguigu.morningtest;

import java.util.Set;
import java.util.TreeSet;

public class TestOne {
    public static void main(String[] args) {
        // 自然排序,需要实体类本身可以进行排序，实现Comparable接口
        Set set = new TreeSet();

        Student stu = new Student("Tom",20,"男");
        Student stu1 = new Student("Jerry",21,"男");
        Student stu2 = new Student("Mary",22,"女");
        Student stu3 = new Student("Jack",23,"男");

        set.add(stu);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);

        for (Object o : set) {
            System.out.println(o);
        }
    }
}
