package com.atguigu.test;

public class Father {

    public static final String one = "100";// 公开静态常量需要在声明属性的同时赋值，并且值不再改变.
    private int two = methodTwo();
    private int three = methodThree();
    public static int four = methodOne();// 静态属性在类加载后即分配空间，在构造方法中赋值不合适。

    static{
        // 静态代码块在类加载后即调用，顺序是先初始化静态变量，然后调用静态代码块
        // 静态代码块的作用是为静态属性初始化
        System.out.println("in Father static stack");
        four = 400;
    }

    {
        // 代码块的调用时机是创建对象时，早于构造方法
        System.out.println("in Father stack");
    }


    public Father() {
        System.out.println("in Father()");
    }

    public Father(int two, int three) {
        System.out.println("in Father(int,int)");
        this.two = two;
        this.three = three;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public int getThree() {
        return three;
    }

    public void setThree(int three) {
        this.three = three;
    }

    public static int methodOne(){
        System.out.println("in Father static methodOne()~~~");
        return 101;
    }

    public int methodTwo(){
        System.out.println("in Father methodTwo()~~~");
        return 102;
    }

    public int methodThree(){
        System.out.println("in Father methodThree()~~~");
        return 103;
    }
}

class Son extends Father{
    public static int five = methodFive();
    private int six = methodSix();

    static{
        System.out.println("in Son static stack");
    }

    {
        System.out.println("in Son stack");
    }

    public Son(){
        System.out.println("in Son()");
    }

    public int getSix() {
        return six;
    }

    public void setSix(int six) {
        this.six = six;
    }

    public static int methodFive(){
        System.out.println("in Son static methodFive()");
        return 200;
    }

    public int methodSix(){
        System.out.println("in Son methodSix()");
        return 300;
    }
}


