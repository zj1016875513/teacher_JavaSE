package com.atguigu.morningtest;

public class TestOne {
    public static void main(String[] args) {
        Person person = new Teacher();
        person.sayHello();
        Person person1 = new Student();
        person1.sayHello();
    }
}
