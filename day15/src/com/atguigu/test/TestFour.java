package com.atguigu.test;

import java.util.Scanner;

public class TestFour {
    public static void main(String[] args) {
        int[] nums = {23,43,83,66,0,0,0};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要插入的元素");
        int number = input.nextInt();
        System.out.println("请输入要插入的下标");
        int index = input.nextInt();

        for(int i = nums.length - 1;i >= index;i--){
            if(nums[i] == 0){
                continue;
            }

            nums[i+1] = nums[i];
        }

        nums[index] = number;

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
