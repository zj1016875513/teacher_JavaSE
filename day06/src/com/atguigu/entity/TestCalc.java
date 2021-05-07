package com.atguigu.entity;

import java.util.Scanner;

public class TestCalc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个操作数");
        calc.one = input.nextInt();
        System.out.println("请输入第二个操作数");
        calc.two = input.nextInt();
        System.out.println("请输入运算符");
        calc.opert = input.next();

        int result = calc.count();// 方法的返回值返回到方法的调用点，方法的返回值可以为变量赋值
        System.out.println(result);
    }
}
