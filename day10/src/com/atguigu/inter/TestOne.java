package com.atguigu.inter;

import com.atguigu.morningtest.MathTeacher;

public class TestOne {
    public static void main(String[] args) {
        // 接口不能实例化,接口需要创建该接口的实现类对象
        Teacher teacher = new LangTeacher();

        teacher.shangKe();
        Master master = new Master();
        LangTeacher lt = new LangTeacher();
        master.askTeacher(lt);// 调用形参是接口的方法时，传递的实参是接口的实现类的对象。

        System.out.println("-----------");

        Teacher en=new EnglishTeacher();
        en.shangKe();
    }
}
