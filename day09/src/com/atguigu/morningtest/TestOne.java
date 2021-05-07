package com.atguigu.morningtest;

public class TestOne {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("旺财");
        dog.setAge(4);
        dog.setGender("公的");
        dog.play();

        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(3);
        cat.setGender("公的");
        cat.play();
    }
}
