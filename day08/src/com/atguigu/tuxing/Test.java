package com.atguigu.tuxing;

public class Test extends Graphic{
    String name="张三";
    public Test(String name) {
        super(name);

    }
    public String A(){
        return super.getName();
    }

    public static void main(String[] args) {
       Test cc= new Test("123");
        System.out.println(cc.name);
        System.out.println(cc.A());
    }
}
/*
class Test2{

        }*/
