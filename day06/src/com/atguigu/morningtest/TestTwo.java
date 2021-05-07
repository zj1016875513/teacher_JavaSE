package com.atguigu.morningtest;

import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {
        double[] nums = {55,10,9,1.5};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字");
        double d = input.nextDouble();
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if(d == nums[i]){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("找到了这个数字");
        }else{
            System.out.println("没有找到这个数字");
        }
    }
}
