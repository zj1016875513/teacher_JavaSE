package com.atguigu.morningtest;

public class TestFour {
    public static void main(String[] args) {
        int[][] one = new int[5][3];// 同时给出一维数字和二维数组的长度，此时所有的数组都已经初始化完成

        one[0][0] = 100;

        int[][] two = new int[5][];// 只给出一维的长度，不给出二维的长度，此时只有一维数组完成了初始化

        // two[0][0] = 100;// 报空指针异常

        two[0] = new int[3];// 声明二维数组，给一维元素赋值
        two[1] = new int[4];
        two[2] = new int[2];
        two[3] = new int[6];
        two[4] = new int[8];
    }
}
