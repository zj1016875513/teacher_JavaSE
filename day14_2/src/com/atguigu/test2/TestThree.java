package com.atguigu.test2;

import java.util.Random;

public class TestThree {
    public static void main(String[] args) {
        int[] nums = new int[16];
        Random random = new Random();
        for(int i = 0;i < 100; i++) {
            int num =  random.nextInt(nums.length);// 随机产生0到参数前一位的整数
            System.out.println(num);
        }
    }
}
