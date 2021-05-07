package com.atguigu.morningtest;

public class Master {

    public void askTeacher(Teacher teacher){
        if(teacher instanceof EnglishTeacher){
            EnglishTeacher et = (EnglishTeacher)teacher;
            et.shangKe();
            et.tingLi();
        }else {
            teacher.shangKe();
        }
    }

}
