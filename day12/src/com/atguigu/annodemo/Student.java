package com.atguigu.annodemo;

@MyAnno(zhi={"hello","nihao","byebye"})
public class Student {
    @MyAnno(zhi="hello",one="one",value="hello")
    private int stuName;

    @MyAnno("hello")
    public Student(){

    }

    @MyAnno("hello")
    public void sayHello(){

        int one = 100;
    }
}
