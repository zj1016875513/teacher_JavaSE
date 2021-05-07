package com.atguigu.annodemo;


public class TestOne {
    // 将抑制警告注解放在方法上，整个方法的该类警告都被抑制
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // 抑制警告注解,放在变量上的注解只能控制当前变量，其他变量不能控制
        // @SuppressWarnings("unused")
        int one = 100;
        // System.out.println(one);

        int two = 200;
        // List list = new ArrayList();
        // System.out.println(list.size());
        methodOne();
    }

    // 标注方法过期注解
    @Deprecated
    public static void methodOne(){
        System.out.println("in static methodOne");
    }
}
