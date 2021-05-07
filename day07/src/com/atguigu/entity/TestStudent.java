package com.atguigu.entity;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        Student student = new Student("Tom",20,"男");
        // student.stuName = "Tom";
        // student.setStuName("tom");
//        System.out.println(student.getStuName());
//        System.out.println(student.getStuAge());
//        System.out.println(student.getStuGender());
        String name = "小明";
        // student.sayHello();
        student.sayHello(name);

        System.out.println("hello");
        System.out.println(10);
        System.out.println(stu);
    }
}
