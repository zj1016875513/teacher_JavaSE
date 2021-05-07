package com.atguigu.innerclass;

public class OuterTwo {
    private int one;
    private static int two;

    // 普通成员内部类
    // 普通成员内部类中只能声明普通的成员，不能声明静态的成员
    public class InnerTwo{
        private int three;
        // private static int four;

        public void methodThree(){
            // 普通成员内部类可以访问外部所有的类型的属性和方法
            System.out.println(one);
            System.out.println(two);
            System.out.println(three);
            methodOne();
            methodTwo();
            System.out.println("in InnerTwo methodThree()~~~~~");
        }

        /*
        public static void methodFour(){

        }
        */
    }

    public void methodOne(){
        // 在定义内部类的外部类类体中直接创建内部类对象
        InnerTwo innerTwo = new InnerTwo();
        System.out.println(innerTwo.three);
        innerTwo.methodThree();
        System.out.println("in OuterTwo methodOne()~~~");
    }

    public static void methodTwo(){
        System.out.println("in OuterTwo static methodTwo()~~~");
    }


}
