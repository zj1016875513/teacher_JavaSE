package com.atguigu.morningtest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestThree {
    public static void main(String[] args) {
        try {
            // 获取反射对象
            Class classOne = Student.class;

            // 利用反射创建类类对象代表的类的对象
            // Object obj = classOne.newInstance();// 调用类的无参构造方法创建对象
            // 利用有参构造方法创建对象
            Constructor cons = classOne.getDeclaredConstructor(String.class,int.class,String.class);
            Object obj = cons.newInstance("Tom",20,"男");

            // 调用属性,首先获取属性对象
            Field field = classOne.getDeclaredField("stuName");
            field.setAccessible(true);// 设置私有属性可以被访问
            System.out.println(field.get(obj));
            field.set(obj,"Jerry");
            System.out.println(field.get(obj));

            // 利用反射调用方法
            Method method = classOne.getDeclaredMethod("setStuName", String.class);
            method.invoke(obj,"Mary");
            System.out.println(field.get(obj));


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
