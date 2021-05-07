package com.atguigu.test;

public class TestOne {
    public static void main(String[] args) {

        for(int i = 0;i < 100; i++){
            System.out.println(i+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        methodOne();
    }

    public static void methodOne(){
        for(int i = 0;i < 100; i++){
            System.out.println(i+"=================================");
        }
    }
}
