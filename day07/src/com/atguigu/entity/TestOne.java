package com.atguigu.entity;

public class TestOne {

    public static void main(String[] args) {
        /*
        int a = 10;
        int b = 20;
        System.out.println("1 a="+a+",b="+b);
        methodOne(a,b);
        System.out.println("2 a="+a+",b="+b);
        */
        ChangeNum cn = new ChangeNum();
        cn.a = 10;
        cn.b = 20;
        System.out.println("1 a="+cn.a+",b="+cn.b);
        methodTwo(cn);
        System.out.println("2 a="+cn.a+",b="+cn.b);
    }

    public static void methodOne(int a,int b){// 基础类型传参,方法内对参数的修改不会影响方法外传递的实参
        int temp = a;
        a = b;
        b = temp;
        System.out.println("int methodOne a="+a+",b="+b);
    }

    public static  void methodTwo(ChangeNum cn){// 引用数据类型传参，方法内的修改会影响方法外的实参。
        int temp = cn.a;
        cn.a = cn.b;
        cn.b = temp;
        System.out.println("int methodTwo a="+cn.a+",b="+cn.b);
    }
}

class ChangeNum{
    public int a;
    public int b;
}
