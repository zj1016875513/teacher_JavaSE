package com.atguigu.test1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestFive {
    public static void main(String[] args) {
        try{
            Class classOne = Student.class;
            // Object obj = classOne.newInstance();// 调用类的默认无参构造方法
            // 如何在反射状态下利用有参构造方法
            // 利用参数列表获取相应的构造方法对象
            Constructor constructor = classOne.getDeclaredConstructor(String.class,int.class,String.class);
            Object obj = constructor.newInstance("xiaoming",22,"女");
            System.out.println(obj);
            Field field = classOne.getDeclaredField("stuName");
            String s = (String)field.get(obj);
            System.out.println(s);
            System.out.println("----------------------------");
            Method methodOne = classOne.getDeclaredMethod("study");// 获取无参的方法，只需要传递方法名
            methodOne.setAccessible(true);
            methodOne.invoke(obj);// 运行方法
            Method methodTwo = classOne.getDeclaredMethod("study",int.class,String.class);
            methodTwo.setAccessible(true);
            methodTwo.invoke(obj,10,"hello");
            System.out.println("------------------------------------------");
            Method methodThree = classOne.getDeclaredMethod("sayHello",String.class,int.class,boolean.class);
            methodThree.invoke(null,"nichilema",101,false);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
