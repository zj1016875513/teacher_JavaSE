package com.atguigu.test3;

public class Person1<T,U,X> {
    private String name;
    private int age;
    private T type;
    private U up;
    private X xyz;

    public Person1(T type, U up, X xyz) {
        this.type = type;
        this.up = up;
        this.xyz = xyz;
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

    public U getUp() {
        return up;
    }

    public void setUp(U up) {
        this.up = up;
    }

    public X getXyz() {
        return xyz;
    }

    public void setXyz(X xyz) {
        this.xyz = xyz;
    }
}
