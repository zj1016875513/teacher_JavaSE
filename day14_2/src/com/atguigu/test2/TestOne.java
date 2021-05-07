package com.atguigu.test2;

public class TestOne {
    public static void main(String[] args) {
        double d = Math.floor(-5.1);// 返回距离参数浮点数最近的最小的整数
        System.out.println(d);
        double d1 = Math.ceil(-5.1);// 返回距离参数浮点数最近的最大的整数
        System.out.println(d1);
        double d2 = Math.round(-5.5);// 按照四舍五入的方式取整
        System.out.println(d2);
        System.out.println("----------------------------------------");
        int[] nums = new int[16];
        for(int i = 0;i < 100; i++){
            int random = (int)(Math.random() * nums.length);
            System.out.println(random);
        }
    }
}
