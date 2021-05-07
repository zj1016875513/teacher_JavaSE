package com.atguigu.entity;

import java.util.Scanner;

public class TestCalcOne {
    public static void main(String[] args) {
        CalcOne co = new CalcOne();
        Scanner input = new Scanner(System.in);

        System.out.println("请输入第一个操作数");
        int yi = input.nextInt();
        System.out.println("请输入第二个操作数");
        int er = input.nextInt();
        System.out.println("请输入运算符");
        String fu = input.next();

        // 调用带参的方法，必须按照方法的要求传参，参数类型要求，参数个数要求，参数顺序要求。
        int result = co.count(yi,er,fu);
        System.out.println(result);

    }
}
