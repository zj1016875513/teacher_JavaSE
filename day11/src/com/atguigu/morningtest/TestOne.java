package com.atguigu.morningtest;

public class TestOne {
    public static void main(String[] args) {
        Student[] stus = new Student[5];

        stus[0] = new Student("Tom",20,"男");
        stus[1] = new Student("Jerry",21,"男");
        stus[2] = new Student("Mary",21,"女");
        stus[3] = new Student("SanMao",22,"女");
        stus[4] = new Student("Xiaoqiang",23,"男");

        for(int i = 0;i < stus.length; i++){
            System.out.println(stus[i]);
        }
        System.out.println("-------------------------------------------");
        for(Student s : stus){
            System.out.println(s);
        }
    }
}
