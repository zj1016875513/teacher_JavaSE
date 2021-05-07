package com.atguigu.morningtest;

import java.lang.reflect.Field;

public class TestTwo {
    public static void main(String[] args) {
        // 获取类类对象代表的类的属性
        Class classOne = Student.class;

        // 获取所有public修饰的属性，不仅限于本类，包括继承到的属性
        Field[] fields = classOne.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        // 获取到一个指定名称的public修饰的属性，不仅限于本类，包括继承到的属性
        try {
            Field field = classOne.getField("stuName");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        // 获取到本类的所有修饰符的所有的属性
        Field[] fields1 = classOne.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field.getName());
        }
        // 获取本类的所有修饰符的指定名称的属性
        try {
            Field field = classOne.getDeclaredField("stuName");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
