package com.atguigu.test;

import org.junit.Test;

public class TestTwo {

    @Test
    public void test1(){
        MyInterTwo mit = new MyInterTwo() {
            @Override
            public void methodOne() {
                System.out.println("in MyInterTwo methodOne~~~~~~~~~~~~~~~~~~~");
            }
        };
        mit.methodOne();
        System.out.println("----------------------------------");
        // 接口中的方法无参无返回值
        // 如果lambda显示的接口方法，没有参数，则直接写小括号，但小括号不能省略
        // 如果实现接口中方法的代码超过1行，则需要配有大括号，编写多行代码实现。
        // 如果实现接口中方法的代码只有一行，大括号可以省略。
        MyInterTwo mit1 = () -> {
            System.out.println("in MyInterTwo methodOne=====================");
            System.out.println("in MyInterTwo methodOne=====================");
            System.out.println("in MyInterTwo methodOne=====================");
        };
        mit1.methodOne();
        MyInterTwo mit2 = () -> System.out.println("in MyInterTwo methodOne--------------------");
        mit2.methodOne();

    }

    @Test
    public void test2(){
        MyInterThree mit = new MyInterThree() {
            @Override
            public void methodThree(String s) {
                System.out.println("s="+s+"~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        };
        mit.methodThree("hello");
        System.out.println("-----------------------------------------");
        // 由于参数类型可以有效推断，所以参数类型可以省略
        // 当参数只有一个的时候，可以省略小括号
        MyInterThree mit1 = s -> {
            System.out.println("使用lambda表达式实现");
            System.out.println("s="+s+"=================================");
        };
        mit1.methodThree("nihao");
        MyInterThree mit2 = s -> System.out.println("s="+s+"---------------------");
        mit2.methodThree("biabai");
    }

    @Test
    public void test3(){
        MyInterFour mif = new MyInterFour() {
            @Override
            public String methodFour(String s1, String s2) {
                System.out.println("s1="+s1+",s2="+s2);
                return s1+s2;
            }
        };
        System.out.println(mif.methodFour("hello", "world"));
        System.out.println("---------------------------------------");
        // 方法有两个以上参数时，小括号不能省略，参数类型可以省略，多个参数间用逗号隔开
        MyInterFour mif1 = (s1,s2) ->  {
            System.out.println("s1="+s1+",s2="+s2);
            return s1+s2;
        };
        System.out.println(mif1.methodFour("one", "world"));

        MyInterFour mif2 = (s1,s2) -> {return s1+s2;};// 单行代码实现，带有return关键字返回形式，必须有大括号

        MyInterFour mif3 = (s1,s2) -> s1+s2;// 单行代码实现，不写return关键字，可以省略大括号
    }
}

@FunctionalInterface
interface MyInterTwo{
    public void methodOne();
}

@FunctionalInterface
interface MyInterThree{
    public void methodThree(String s);
}

@FunctionalInterface
interface MyInterFour{
    public String methodFour(String s1,String s2);
}

