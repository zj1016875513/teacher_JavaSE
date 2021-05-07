package com.atguigu.exceptiondemo;

public class Student {
    private String stuName;
    private int stuAge;
    private String stuGender;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    // 方法签名中，参数列表后的部分被称作抛出异常区，在这个区域使用throws关键字声明本方法抛出的异常种类，可以多个异常同时抛出
    public void setStuAge(int stuAge) throws StuAgeException {
        if(stuAge >= 18 && stuAge <= 40) {
            this.stuAge = stuAge;
        }else{
            // 使用throw关键字抛出一个创建好的异常对象
            throw new StuAgeException("学员的年龄必须在18--40之间");
        }
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }
}
