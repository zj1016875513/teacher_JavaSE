package com.atguigu.morningtest;

public class TestStudent {

    public static void main(String[] args) {

        Student student = new Student();
        student.stuName = "Tom";
        student.stuAge = 20;
        student.stuGender = "男";

        student.sayHello();
    }
}
