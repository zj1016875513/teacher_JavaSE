package com.atguigu.enumdemo;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();

        // Gender man = Gender.MAN;

        stu.setStuName("Tom");
        stu.setStuAge(20);
        stu.setStuGender(Gender.MAN);
        System.out.println(stu.getStuName());
        System.out.println(stu.getStuAge());
        System.out.println(stu.getStuGender());
        System.out.println("------------------------------------");
        Student stu1 = new Student("Jerry",21,Gender.WEMON);
        System.out.println(stu1);
    }
}
