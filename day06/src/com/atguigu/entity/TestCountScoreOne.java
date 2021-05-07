package com.atguigu.entity;

import java.util.Scanner;

public class TestCountScoreOne {
    public static void main(String[] args) {
        CountScoreOne cso = new CountScoreOne();
        Scanner input = new Scanner(System.in);
        Score score =  new Score();
        System.out.println("请输入语文成绩");
        score.lang = input.nextInt();
        System.out.println("请输入数学成绩");
        score.math = input.nextInt();
        System.out.println("请输入英语成绩");
        score.english = input.nextInt();

        int sum = cso.countSum(score);
        System.out.println("总分："+sum);
        int avg = cso.countAvg(score);
        System.out.println("平均分："+avg);
    }
}
