package com.atguigu.exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        // 异常也被称作运行时错误
        // try块的作用是监控可能出现异常的代码段
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入被除数");
            int one = input.nextInt();// 程序在出现异常的那行代码位置终止，创建一个该类异常对象，向上抛出。
            System.out.println("请输入除数");
            int two = input.nextInt();// 出现异常程序中止，抛出相应的异常对象

            int result = one / two;

            System.out.println("result=" + result);
        }catch (InputMismatchException ex){
            //字面意思是输入不匹配异常
            // catch捕获相应异常对象，catch块捕获异常后开始运行catch块代码，catch结束后，程序继续向下运行。
            // System.out.println("出异常啦~~");
            ex.printStackTrace();  //在命令行打印异常信息在程序中出错的位置及原因。
        }catch (ArithmeticException ex){    //ArithmeticException：数学计算异常
            ex.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("程序结束");
    }
}
