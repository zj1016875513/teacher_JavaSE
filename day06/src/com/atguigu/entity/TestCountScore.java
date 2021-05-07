package com.atguigu.entity;

import java.util.Scanner;

public class TestCountScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入语文成绩");
        int lang = input.nextInt();
        System.out.println("请输入数学成绩");
        int math = input.nextInt();
        System.out.println("请输入英语成绩");
        int english = input.nextInt();

        CountScore cs = new CountScore();
        int sum = cs.countSum(lang,math,english);
        System.out.println("总分是:"+sum);
        int avg = cs.countAvg(lang,math,english);
        System.out.println("平均分："+avg);
    }
}
