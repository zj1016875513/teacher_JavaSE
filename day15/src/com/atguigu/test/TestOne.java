package com.atguigu.test;

public class TestOne {
    public static void main(String[] args) {
        int[] nums = {35,69,90,20,120,63,32};
        int[] numsOne = new int[nums.length];

        for(int i = 0,j = nums.length - 1;i < nums.length; i++,j--){
            numsOne[i] = nums[j];
        }

        nums = numsOne;

        for (int num : nums) {
            System.out.println(num);
        }

        System.out.println("------------------------------------------");

    }
}
