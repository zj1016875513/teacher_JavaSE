package com.atguigu.test;

import java.util.Scanner;

public class TestFive {
    public static void main(String[] args) {
        int[] nums = {35,69,90,20,120,63,32};

        Scanner input = new Scanner(System.in);
        System.out.println("请输入要删除的下标");
        int index = input.nextInt();
        int index1 = -1;

        for(int i = 0;i < nums.length; i++){
            if(nums[i] == 0){
                index1 = i - 1;
                break;
            }
        }

        if(index1 == -1){
            index1 = nums.length - 1;
        }

        for(int i = index + 1;i < index1 + 1; i++){
            nums[i - 1] = nums[i];
        }

        nums[index1] = 0;

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
