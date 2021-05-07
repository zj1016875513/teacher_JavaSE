package com.atguigu.test;

public class TestThree {
    public static void main(String[] args) {
        Integer[] nums = {23,0,83,0};

        Integer[] numsOne = new Integer[nums.length*2];

        // 复制原数组元素进新数组
        for(int i = 0;i < nums.length; i++){
            numsOne[i] = nums[i];
        }

        int one = 101;
        for(int i = 0;i < numsOne.length; i++){
            if(numsOne[i] == null){
                numsOne[i] = one;
                break;
            }
        }

        for (Integer i : numsOne) {
            if(i == null){
                break;
            }
            System.out.println(i);
        }
    }
}
