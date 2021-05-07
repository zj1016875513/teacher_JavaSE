package com.atguigu.morningtest;

import java.util.Arrays;
import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {
        String s = null;
        Arrays.sort(new int[]{1,2,3});
        Scanner input = new Scanner(System.in);
        String[] words = new String[3];

        for (int i = 0; i < words.length; i++) {
            System.out.println("请输入第"+(i+1)+"个字符串");
            words[i] = input.next();
        }

        for(int i = words.length-1;i >= 0; i--){
            System.out.println(words[i]);
        }
    }
}
