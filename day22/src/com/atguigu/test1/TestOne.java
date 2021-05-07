package com.atguigu.test1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestOne {

    @Test
    public void test1(){
        List<Student> stus = StudentData.getList();

        for (Student student : stus) {
            System.out.println(student);
        }
    }

    @Test
    public void test2(){
        // 使用集合创建Stream流
        List<Student> list = StudentData.getList();
        Stream<Student> stream = list.stream();// 使用集合创建Stream流
        stream.forEach(s -> System.out.println(s));// 终止操作，遍历stream流中的数据
    }

    @Test
    public void test3(){
        Object[] stus =  StudentData.getList().toArray();
        //使用数组创建Stream流
        Stream stream = Arrays.stream(stus);
        stream.forEach(s -> System.out.println(s));
    }

    @Test
    public void test4(){
        // 使用散列数据产生
        Stream<String> stream = Stream.of("hello","nihao","one word","xiaoqiang");
        stream.forEach(s -> System.out.println(s));
    }

    @Test
    public void test5(){
        // 使用filter过滤中间操作处理的流
        List<Student> list = StudentData.getList();
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("--------------------------------------------");
        Stream<Student> stream = list.stream();
        Stream<Student> stream1 = stream.filter(s -> s.getScore()>= 60);// 过滤的中间操作
        Stream<Student> stream2 = stream1.filter(s -> s.getGrade() == 3);
        Stream<Student> stream3 = stream2.filter(s -> s.getName().startsWith("王"));
        stream3.forEach(s -> System.out.println(s));
    }
}
