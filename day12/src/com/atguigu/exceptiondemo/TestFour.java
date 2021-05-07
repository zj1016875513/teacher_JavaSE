package com.atguigu.exceptiondemo;

public class TestFour {
    public static void main(String[] args) {
        /*
        int one = 100;
        int two = 1;

        int result = one / two;
        System.out.println(result);
        */

        try {
            Class.forName("");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
