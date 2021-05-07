package com.atguigu.TT;

public class T1 {
        public static void main(String[] args) {
            Father f = new Son();
            System.out.println(f.x);//只看编译时类型
            f.say();
            System.out.println("Aa".hashCode());//2112
            System.out.println("BB".hashCode());//2112
        }
    }
    class Father{
        int x = 1;
        public void say(){
            System.out.println("我是好父亲");
        }
    }
    class Son extends Father{
        int x = 2;
        public void say(){
            System.out.println("我是好儿子");
        }
    }

