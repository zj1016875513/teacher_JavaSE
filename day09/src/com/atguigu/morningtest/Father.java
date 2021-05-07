package com.atguigu.morningtest;

public class Father {
    public int a = 1;
    private int b = 1;
    public int c = 1;

    public int getB(){
        System.out.println("in father method getB()");
        return b;
    }

    public void setB(int b){
        this.b = b;
    }

    public static void main(String[] args) {
        Father father = new Son();
        System.out.println(father.a);
        System.out.println(father.getB());
    }
}

class Son extends Father{
    public int a = 2;
    private int b = 2;
    public int d = 2;


    public int getB(){
        System.out.println("in son method getB()");
        return b;
    }

    public void setB(int b){
        this.b = b;
    }

}
