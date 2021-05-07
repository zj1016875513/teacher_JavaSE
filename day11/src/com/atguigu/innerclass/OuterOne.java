package com.atguigu.innerclass;

public class OuterOne {

    private int one;
    public int five;
    private static int two;
    // 由static修饰的成员内部类被称作静态成员内部类
    // 静态成员内部类只能访问外部类的静态成员不能访问普通成员
    // 静态成员内部类中可以声明静态成员，也可以声明普通成员
    public static class InnerOne{
        private int three;
        public static int four;

        public void methodThree(){
            System.out.println(three);
            System.out.println(four);
            // System.out.println(one);// 静态成员内部类不能访问外部类的普通成员
            // System.out.println(five);
            System.out.println(two);// 内部类可以直接访问外部类的私有属性
            System.out.println("in InnerOne methodThree()~~");
            // methodFour();
            // methodOne();// 静态成员内部类不能访问外部类的普通成员
            // methodTwo();
        }

        public static void methodFour(){
            // System.out.println(one);
            // System.out.println(five);
            System.out.println(two);
            // System.out.println(three);// 静态的成员不能访问普通的成员
            System.out.println(four);
            System.out.println("in InnerOne static methodFour()~~");
            methodTwo();
        }
    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public void methodOne(){
        System.out.println("in OuterOne methodOne~~");
    }

    public static void methodTwo(){
        // 在定义内部类的外部类类体中创建内部类对象
        InnerOne innerOne = new InnerOne();
        InnerOne.methodFour();
        System.out.println(InnerOne.four);
        innerOne.methodThree();
        System.out.println(innerOne.three);
        System.out.println("in OuterOne statc methodTwo~~");
    }

}
