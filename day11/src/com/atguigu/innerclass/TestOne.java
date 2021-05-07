package com.atguigu.innerclass;

public class TestOne {
    public static void main(String[] args) {
        // 静态成员内部类在定义自己的外部类类体外创建对象
        // 在外部类以外的地方，内部类不能直接出现，需要外部类类名.内部类类名
        // 静态成员内部类，可以直接创建内部类对象，无需先创建外部类对象
        OuterOne.InnerOne innerOne = new OuterOne.InnerOne();
        innerOne.methodThree();
    }
}
