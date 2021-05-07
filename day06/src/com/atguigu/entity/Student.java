package com.atguigu.entity;

public class Student {

    public String stuName;
    public int stuAge;
    public String stuGender;

    // 一个普通的方法由五个常规部分组成
    // public为访问修饰符，访问修饰符修饰类的成员，public为公开模式，任何位置都可以访问
    // private为私有访问，只能本类使用，其他位置不能访问
    // void位置是返回类型，规定了该方法结束是返回的值的类型。void为该方法无返回
    public void sayHello(){
        System.out.println("你好，我叫"+stuName+",我今年"+stuAge+"岁,我是一名"+stuGender+"同学");
        return;
    }

    // 该方法返回int型，一个方法如果规定了返回类型，则必须在方法结束时返回该类型的一个值。
    public int methodOne(){
       int num = 0;

       return num;// 使用return关键字返回值
    }

}
