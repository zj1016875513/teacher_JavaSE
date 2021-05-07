package com.atguigu.test1;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestTwo {
    @Test
    public void test1(){
        Stream<Student> stream = StudentData.getList().stream();
        Stream stream1 = stream.filter(s -> s.getScore() <= 60)
                .filter(s -> s.getGrade() == 3 || s.getGrade() == 4)
                .filter(s -> s.getName().startsWith("王"));
        stream1.forEach(s -> System.out.println(s));
        System.out.println("-------------------------------");
        StudentData.getList().parallelStream();
        StudentData.getList().stream()
                .filter(s -> s.getScore() <= 60)
                .filter(s -> s.getGrade() == 3 || s.getGrade() == 4)
                .filter(s -> s.getName().startsWith("王"))
                .forEach(s -> System.out.println(s));
    }

    @Test
    public void test2(){
        StudentData.getList().stream().forEach(s -> System.out.println(s));
        System.out.println("---------------------------------------------");
        StudentData.getList().stream().distinct().forEach(s -> System.out.println(s));
    }

    @Test
    public void test3(){
        StudentData.getList().stream().distinct().sorted().forEach(s -> System.out.println(s));
    }

    @Test
    public void test4(){
        StudentData.getList().stream().limit(15).skip(10).forEach(s -> System.out.println(s));
    }

    @Test
    public void test5(){
       long num =  StudentData.getList().stream().filter(s -> s.getScore() >= 60).count();
       System.out.println(num);
       System.out.println("----------------------------------");
       Optional<Student> optional = StudentData.getList().stream().filter(s -> s.getGrade() == 3).sorted().findFirst();
       Student stu = optional.get();
       System.out.println(stu);
    }

    @Test
    public void test6(){
        Stream<Student> stream = StudentData.getList().stream().filter(s -> s.getScore() >= 60);
        List<Student> list = stream.collect(Collectors.toList());
        for (Student student : list) {
            System.out.println(student);
        }
        Set<Student> set = stream.collect(Collectors.toSet());
    }
}
