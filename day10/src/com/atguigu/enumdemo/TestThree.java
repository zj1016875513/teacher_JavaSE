package com.atguigu.enumdemo;

// 在switch-case结构中使用枚举
public class TestThree {
    public static void main(String[] args) {

        Gender gender = Gender.MAN;

        switch (gender){
            case MAN:
                System.out.println("男");
                break;
            case  WEMON:
                System.out.println("女");
                break;
                default:
                    System.out.println("不知道");
                    break;
        }
    }
}
