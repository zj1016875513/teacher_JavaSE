package com.atguigu.entity;

public class TestStudent {
    public static void main(String[] args) {
        // 需要使用一个类的属性或者方法时，必须先创建这个类的对象
        Student student = new Student();
        // 对象名.属性名或者对象名.方法名()访问属性和方法
        student.stuName = "Tom";
        student.stuAge = 20;
        student.stuGender = "男";
        student.sayHello();
        Student student1 = new Student();
        student1.stuName = "Mary";
        student1.stuAge = 21;
        student1.stuGender = "女";
        student1.sayHello();
    }
}
