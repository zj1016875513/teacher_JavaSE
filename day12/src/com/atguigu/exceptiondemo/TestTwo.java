package com.atguigu.exceptiondemo;

import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {
        // try块必须存在，try块不能独立存在
        // try块可以和catch块一起存在，也可以和finally一起存在，也可以和catch、fainlly同时存在。
        try{
            System.out.println("in try one");
            Scanner scanner = new Scanner(System.in);
            scanner.nextInt();
            System.out.println("in try two");
            // System.exit(0);
            return;
        }catch(Exception ex){
            System.out.println("in catch");
            ex.printStackTrace();
        }finally {// finally块一定执行，无论程序是否异常。由于finally一定执行，所以经常用于写释放资源的代码
            System.out.println("in fianlly");
        }
        System.out.println("程序结束");
    }
}
