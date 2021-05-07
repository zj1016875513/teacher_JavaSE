package com.atguigu.morningtest;

import java.util.Random;

public class TestThree {
    public static void main(String[] args) {
        int[] nums = new int[]{35,87,90,112,44};
        for(int i = 0;i < nums.length; i++){
            int index = (int)(Math.random() * nums.length);
            System.out.println(nums[index]);
        }
        System.out.println("--------------------------");
        Random random = new Random();
        for(int i = 0;i < nums.length; i++){
            int index = random.nextInt(nums.length);
            System.out.println(nums[index]);
        }
    }
}
