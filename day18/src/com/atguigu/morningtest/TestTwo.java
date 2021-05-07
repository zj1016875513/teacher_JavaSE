package com.atguigu.morningtest;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTwo {
    public static void main(String[] args) {
        // 定制排序，实体类本身不需要排序，由创建TreeSet时传入比较器对象进行排序
        Set set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int result = 0;
                Student stu1 = (Student)o1;
                Student stu2 = (Student)o2;

                result = stu1.getStuName().compareTo(stu2.getStuName());
                if(result == 0){
                    result = stu1.getStuAge() - stu2.getStuAge();
                }
                if(result == 0){
                    result = stu2.getStuGender().compareTo(stu2.getStuGender());
                }

                return result;
            }
        });

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
