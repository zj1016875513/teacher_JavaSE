package com.atguigu.morningtest;

public class TestOne {
    public static void main(String[] args) {
        for(int i = 10;i >= 0; i--){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+"~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        System.out.println("新年快乐");
    }
}
