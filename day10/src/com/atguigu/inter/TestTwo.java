package com.atguigu.inter;

public class TestTwo {
    public static void main(String[] args) {
        // 一个类实现了多个接口，那么它实现的任何一个接口需要创建对象的时候，都可以创建这个类的对象
        LangTeacher lt = new LangTeacher();
        MathTeacher mt = new MathTeacher();

        Teacher teacher = mt;
        teacher.shangKe();
//        teacher.methodOne();// 接口中的default方法，创建实现类对象，调用方法，方法体现接口的特征
//        Teacher.methodTwo();// 接口中的static方法，必须由接口名调用。

//        Person person = lt;
//        person.sayHello();
    }
}
