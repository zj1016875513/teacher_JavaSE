package com.atguigu.test;

import java.util.HashSet;
import java.util.Set;

public class TestTwo {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add("苹果");
        set.add("香蕉");
        set.add("葡萄");
        set.add("葡萄");
        set.add("葡萄");

        System.out.println(set.size());

        System.out.println(set);
        System.out.println("--------------------------------------");
        // 自定义实体类在默认情况下只能去掉内存地址相同的重复记录
        // HashSet去重时，首先调用hashCode方法，在hashCode方法判定两个对象不相等时，直接将新元素存储到集合中
        // 当hashCode方法判定两个对象相等时，调用equals方法判定两个对象是否相等，equals方法返回true则判定两个对象相等，不执行新增操作
        // equals方法返回false，则判断两个对象不相等，将元素添加进集合
        Set setOne = new HashSet();
        Student stu = new Student("Tom",20,"男");
        Student stu1 = new Student("Jerry",21,"男");
        Student stu2 = new Student("Mary",22,"女");
        // Student stu3 = stu2;
        Student stu3 = new Student("男",20,"Tom");
        setOne.add(stu);
        setOne.add(stu1);
        setOne.add(stu2);

        System.out.println(setOne.size());
        setOne.add(stu3);
        setOne.add(stu3);
        System.out.println(setOne.size());
        for (Object o : setOne) {
            Student student = (Student)o;
            System.out.println(student);
        }
    }
}
