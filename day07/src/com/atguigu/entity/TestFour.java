package com.atguigu.entity;

import java.util.Arrays;

public class TestFour {
    public static void main(String[] args) {
        // static关键字可以修饰类的成员
        Person person = new Person();
        person.setName("Tom");
        person.setAge(20);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        // static修饰的属性和方法应该由类名调用,不需要创建对象
        Person.country = "中国";
        System.out.println(Person.country);
        Person.methodOne();
        System.out.println("---------------------------------");
        // static修饰的属性被称为类变量
        // static修饰的成员属于类级别的成员，普通的成员属于对象级别的成员。
        Person man = new Person();
        Person women = new Person();
        man.setName("小强");
        System.out.println(women.getName());
        man.country = "中国";
        System.out.println(women.country);
        women.country = "美国";
        System.out.println(man.country);
        System.out.println("********************************");
        man.methodTwo();


    }
}
