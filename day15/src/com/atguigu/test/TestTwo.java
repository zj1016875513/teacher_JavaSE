package com.atguigu.test;

public class TestTwo {
    public static void main(String[] args) {
        int[] nums = {35,69,90,20,120,63,32,100};

        for(int i = 0,j = nums.length - 1;i < nums.length / 2 ;i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
