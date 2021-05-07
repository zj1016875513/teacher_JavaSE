package com.atguigu.morningtest;

public class TestFour {
    public static void main(String[] args) {
        Class classOne = Student.class;

        classOne.getName();// 获取类类对象代表的类的完整类名
        classOne.getSimpleName();// 获取类类对象代表的类的类名，不包含包名
        classOne.getPackage();// 获取类类对象代表的类的所在包的包对象
        classOne.getFields();// 获取类类对象代表的类的所有的public修饰的属性，不仅限本类，包括继承到的属性
        try {
            classOne.getField("stuName");// 获取类类对象代表的类的指定名称的public修饰的属性，不仅限于本类，包括继承到的属性
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        classOne.getDeclaredFields();// 获取类类对象代表的类的所有的修饰符修饰的所有的属性，仅限本类
        try {
            classOne.getDeclaredField("stuName");// 获取类类对象代表的类的一个指定名称的任意访问修饰符的属性，仅限本类
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        classOne.getMethods();// 获取类类对象代表的类的所有public修饰的方法，不仅限于本类，包括继承到的方法
        try {
            classOne.getMethod("setStuName", String.class);// 获取类类对象代表的类的一个指定名称的public修饰的方法，不仅限于本类，包括继承到的方法
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        classOne.getDeclaredMethods();// 获取类类对象代表的类的所有的修饰符修饰的所有的方法，仅限本类
        try {
            classOne.getDeclaredMethod("setStuName", String.class);// 获取类类对象代表的类的一个指定名称的任意修饰符修饰的方法，仅限本类
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        classOne.getConstructors();// 获取类类对象代表的类的所有public修饰的构造方法，仅限本类
        classOne.getDeclaredConstructors();// 获取类类对象代表的类的所有修饰符的所有构造方法，仅限本类
        try {
            classOne.getConstructor(String.class,int.class,String.class);// 根据参数列表，获取指定参数形式的public修饰的构造方法
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        try {
            classOne.getDeclaredConstructor(String.class,int.class,String.class);// 根据参数列表，获取指定参数形式的任意修饰符的构造方法
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
