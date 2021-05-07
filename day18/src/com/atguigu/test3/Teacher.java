package com.atguigu.test3;

// 如果子类继承了一个泛型的父类，并没有在继承时指定类型，那么将默认使用Object
// public class Teacher extends Person {
// 子类在继承父类时，直接指定继承父类的泛型的具体类型，那么子类将不需要在实现泛型
// public class Teacher extends Person<Integer> {

// 子类继承父类泛型，子类也是泛型的类，那么必须在创建子类对象时给出泛型具体类型，否则使用Object
public class Teacher<T> extends Person<T> {
}
