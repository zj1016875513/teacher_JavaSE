package com.atguigu.innerclass;

public class OuterThree {

    private int one;
    private static int two;

    public void methodOne(){
        // 局部内部类是声明在方法体中的内部类
        // 局部内部类不能声明静态的成员，只能声明普通的成员
        // 局部内部类可以访问外部类所有的属性和方法
        // 局部内部类只能在定义它的方法内使用
        class InnerThree{
            private int three;
            // private static int four;

            public void methodThree(){
                System.out.println(one);
                System.out.println(two);
                System.out.println(three);
                System.out.println("in InnerThree methodThree()~~~~");
                methodTwo();
                methodFive();
            }
            /*
            public static void methodFour(){

            }
            */
        }
        // 创建局部内部类对象，调用局部内部类的属性和方法
        InnerThree innerThree = new InnerThree();
        System.out.println(innerThree.three);
        innerThree.methodThree();
    }

    public void methodTwo(){
        System.out.println("in OuterThree methodTwo()");
    }

    public static void methodFive(){
        System.out.println("in OuterThree stiatc methodFive()");
    }


}
