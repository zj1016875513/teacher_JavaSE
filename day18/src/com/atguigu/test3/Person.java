package com.atguigu.test3;

public class Person<T> {
    private String name;
    private int age;
    private T type;

    public Person() {
    }

    public Person(String name, int age, T type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
