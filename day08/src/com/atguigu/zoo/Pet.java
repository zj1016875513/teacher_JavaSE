package com.atguigu.zoo;

// 宠物类
// java语言规定，如果一个类有显示的extends继承自另一个类，那么它的父类就是这个被继承的类。
// 一个类没有extends继承自另一个类，则隐示的继承自Object
//  Object是所有java类的总父类
public class Pet{

    private String name;
    private int age;
    private String gender;

    public Pet(){

    }

    public Pet(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void play(){
        System.out.println("和主人玩儿");
    }
}
