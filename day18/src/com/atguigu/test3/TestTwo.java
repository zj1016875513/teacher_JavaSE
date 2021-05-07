package com.atguigu.test3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestTwo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);

        list.add("苹果");
        list.add("香蕉");
        list.add("西瓜");
        list.add("芒果");

        // methodTwo(list);
        // methodTwo(list1);

        methodThree(list);
        methodThree(list1);
        System.out.println("-----------------------------------------");
        List<Animal> listOne = new ArrayList<>();
        List<Dog> listTwo = new ArrayList<>();
        List<Cat> listThree = new ArrayList<>();

        methodThree(listOne);
        methodThree(listTwo);
        methodThree(listThree);

        methodFour(listOne);
        methodFour(listTwo);
        methodFour(listThree);
        // methodFour(list);

        methodFive(listOne);
        // methodFive(listTwo);
        methodFive(listThree);
    }

    public static void methodOne(Collection coll){
        for (Object o : coll) {
            System.out.println(o);
        }
    }

    // Collection<String> coll = new ArryList<String>();
    // Collection<String> coll = new ArryList<Integer>();
    // Collection<Object> coll = new ArryList<Integer>();
    public static void methodTwo(Collection<Object> coll){
        for (Object o : coll) {
            System.out.println(o);
        }
    }

    // 泛型没有多态，但是泛型可以使用？通配符来适用各种数据类型的情况
    public static void methodThree(Collection<?> coll){
        for (Object o : coll) {
            System.out.println(o);
        }
    }

    // ?所通配的类必须是Animal或者Animal的子类，以及子类的子类……，这相当于规定了泛型的上限
    public static void methodFour(Collection<? extends Animal> coll){
        for (Object o : coll) {
            System.out.println(o);
        }
    }

    // ?通配符必须是Cat类或者Cat类的父类，以及父类的父类……，这个相当于规定了泛型的下限
    public static void methodFive(Collection<? super Cat> coll){
        for (Object o : coll) {
            System.out.println(o);
        }
    }
}

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{};
