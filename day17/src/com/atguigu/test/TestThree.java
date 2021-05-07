package com.atguigu.test;

import java.util.HashSet;
import java.util.Set;

public class TestThree {
    public static void main(String[] args) {
        Set set = new HashSet();

        Student stu = new Student("Tom",20,"男");
        Student stu1 = new Student("Jerry",21,"男");
        Student stu2 = new Student("Mary",22,"女");
        Student stu3 = new Student("Mary",22,"女");
        Student stu4 = new Student("Mary",22,"女");
        set.add(stu);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);

        System.out.println(set.size());
        System.out.println(set);
    }
}
