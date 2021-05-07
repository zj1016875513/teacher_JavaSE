package com.atguigu.morningtest;

public class TestTwo {
    public static void main(String[] args) {
        Fly fly = new Fly(){
            @Override
            public void flying() {
                System.out.println("你咋不上天呢~~~~~~~~~~~~~~~~~~~");
            }
        };

        fly.flying();
    }
}
