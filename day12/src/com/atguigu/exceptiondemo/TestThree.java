package com.atguigu.exceptiondemo;

import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if(input != null) {
            System.out.println("请输入被除数");
            int one = 0;
            if(input.hasNextInt()) {
               one  = input.nextInt();// 程序在出现异常的那行代码位置终止，创建一个该类异常对象，向上抛出。
            }
            System.out.println("请输入除数");
            int two = input.nextInt();// 出现异常程序中止，抛出相应的异常对象
            if (two == 0) {
                System.out.println("除数不能为0");
            } else {
                int result = one / two;
                System.out.println("result=" + result);
            }
        }


    }
}
