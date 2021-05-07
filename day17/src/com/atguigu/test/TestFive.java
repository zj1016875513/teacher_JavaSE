package com.atguigu.test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TestFive {
    public static void main(String[] args) {
        Set set = new TreeSet();

        // 添加到集合TreeSet中的元素对象的类实现Comparable接口，实现compareTo方法。这种方式被称为自然排序
        Student stu = new Student("Tom",20,"男");
        Student stu1 = new Student("Jerry",21,"男");

        Student stu2 = new Student("Tzm",22,"女");
        Student stu3 = new Student("June",23,"女");

//        Student [] sss={stu,stu1,stu2};
//        Arrays.sort(sss);

        set.add(stu2);
        set.add(stu2);
        set.add(stu3);
        set.add(stu);
        set.add(stu1);

        /*
        set.add("Tom");
        set.add("Jerry");
        set.add("Mary");

        set.add("Mary");
        set.add("Tzm");
        */
        /*
        set.add(3);
        set.add(13);
        set.add(23);
        set.add(5);
        set.add(20);
        */
        for(Object oo:set)
        System.out.println(oo);

//        System.out.println(set);
    }
}
