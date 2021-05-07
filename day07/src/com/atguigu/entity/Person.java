package com.atguigu.entity;

public class Person {
    private String name;
    private int age;

    public static String country;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void methodOne(){
        // 静态成员只能访问静态成员，不能访问普通成员。
        // 普通成员可以访问静态成员，也可以访问普通成员。
        System.out.println(country);
        // System.out.println(this);// 静态方法中不能使用this关键字
        // System.out.println(name);
        // methodTwo();
        System.out.println("in static methodOne~~~~~~~~~~~~~~~~~~~~~");
    }

    public void methodTwo(){
        System.out.println(name);
        System.out.println(this);
        System.out.println(country);
        methodOne();
        System.out.println("in methodTwo~~~~~~~~~~~~~~~~~~~~~");
    }
}
