package com.atguigu.test3;

public class TestOne {
    public static void main(String[] args) {
        // 声明和使用一个泛型的类，如果泛型类型并没有具体类型，则泛型转成Object
        // Person person = new Person();

        // 制定了泛型的类，在创建对象时给出泛型的具体类型
        Person<String> person = new Person<>();
        person.setType("type");
        System.out.println(person.getType());

        Teacher<Double> teacher = new Teacher<>();
        teacher.setType(12.5);


    }
}
