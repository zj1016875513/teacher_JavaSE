package com.atguigu.morningtest;

public class TestOne {
    public static void main(String[] args) {
        Master master = new Master();
        EnglishTeacher et = new EnglishTeacher();
        MathTeacher mt = new MathTeacher();
        LangTeacher lt = new LangTeacher();

        master.askTeacher(mt);
    }
}
