package com.atguigu.enumdemo;

// 枚举类Enum中的常用属性和方法
public class TestTwo {
    public static void main(String[] args) {
        Gender gender = Gender.MAN;
        System.out.println(gender);
        System.out.println(gender.name());// 返回当前枚举值的属性名
        System.out.println(gender.ordinal());// 返回当前枚举值的索引，索引从0开始
        Gender[] genders = Gender.values();// 返回当前枚举类中所有的枚举值
        System.out.println(genders.length);
        for (int i = 0; i < genders.length; i++) {
            System.out.println(genders[i]);
        }

        Gender gender1 = Gender.valueOf("WEMON");// 使用枚举值属性名作为参数创建一个枚举对象，如果属性名写错则抛出异常
        System.out.println(gender1);
    }
}
