package com.atguigu.test;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestThree {
    @Test
    public void test1(){
        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("当前接受的参数字符串的内容是："+s);
            }
        };
        con1.accept("nihao");
        System.out.println("--------------------------------------------");
        Consumer<String> con2 = s -> System.out.println("lambda表达式实现的形式，字符串的内容是："+s);
        con2.accept("hello");
    }

    @Test
    public void test2(){
        Supplier<String> sup1 = new Supplier<String>() {
            @Override
            public String get() {
                return "one world";
            }
        };
        String word = sup1.get();
        System.out.println("匿名内部类实现的形式，返回内容："+word);
        System.out.println("----------------------------------------------");
        Supplier<String> sup2 = () -> "one dream";
        String word1 = sup2.get();
        System.out.println("lambda表达式实现的形式，返回内容："+word1);

    }

    @Test
    public void test3(){
        Predicate<String> pre1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "true".equals(s);
            }
        };
        boolean flag = pre1.test("true");
        System.out.println(flag);
        System.out.println("---------------------------------");
        Predicate<String> pre2 = s -> "false".equals(s);
        boolean flag1 = pre2.test("false");
        System.out.println(flag1);
    }

    @Test
    public void test4(){
        Function<String,Integer> fun1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return new Integer(s);
            }
        };
        Integer one = fun1.apply("100");
        System.out.println(one);
        System.out.println("---------------------------------------------");
        Function<String,Integer> fun2 = s -> new Integer(s);
        Integer two = fun2.apply("200");
        System.out.println(two);
    }
}
