package com.atguigu.test1;

public class TestOne {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tortoise tortoise = new Tortoise();
        rabbit.start();
        tortoise.start();
    }
}
