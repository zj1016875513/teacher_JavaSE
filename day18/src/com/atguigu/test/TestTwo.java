package com.atguigu.test;

import java.util.HashMap;
import java.util.Map;

public class TestTwo {
    public static void main(String[] args) {
        Map map = new HashMap();

        Student stu = new Student("Tom",20,"男");
        Student stu1 = new Student("Jerry",21,"男");
        Student stu2 = new Student("Mary",22,"女");
        Student stu3 = new Student("June",23,"女");

        map.put(stu.getStuName(),stu);
        map.put(stu1.getStuName(),stu1);
        map.put(stu2.getStuName(),stu2);
        map.put(stu3.getStuName(),stu3);

    }
}
