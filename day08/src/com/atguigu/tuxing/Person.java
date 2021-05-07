package com.atguigu.tuxing;

public class Person {
    public static final String COUNTRY = "中国";// 公开静态常量必须在声明的同时赋值，且值不再改变。
    private String name;
    private int age;
    public static int cardNum;

    static{// 静态代码块，调用时机，类加载的时候调用，静态代码块用于为静态属性赋值
        System.out.println("in Person static Stock one");
        cardNum = 110;// 静态属性在类加载时首先分配空间，然后静态代码块执行，可以在静态代码块中为静态属性赋值。
    }

    static{// 静态代码块，调用时机，类加载的时候调用
        System.out.println("in Person static Stock two");
    }

    static{// 静态代码块，调用时机，类加载的时候调用
        System.out.println("in Person static Stock three");
    }

    {   // 代码块,代码块在创建对象时调用，调用早于构造方法
        //  一个类中可以定义多个代码块，代码块在创建对象时都会被调用，调用的顺序和定义的顺序一致
        System.out.println("in Person Stack two");
    }

    {// 代码块,代码块在创建对象时调用，调用早于构造方法
        System.out.println("in Person Stack One");
    }

    {// 代码块,代码块在创建对象时调用，调用早于构造方法
        System.out.println("in Person Stack three");
    }

    public Person(){
        System.out.println("in Person()");
    }

    public Person(String name,int age){
        System.out.println("in Person(String,int)");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
