package com.atguigu.morningtest;

public class TestOne {
    public static void main(String[] args) {
        // 用类名获取Class类对象
        Class classOne = Student.class;

        // 使用对象获取Class类对象
        Student stu = new Student();
        Class classTwo = stu.getClass();

        // 使用类的完成路径创建Class类的对象
        try {
            Class classThree = Class.forName("com.atguigu.morningtest.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 使用类加载器获取Class类的对象
        try {
            Class classFour = Student.class.getClassLoader().loadClass("com.atguigu.morningtest.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
