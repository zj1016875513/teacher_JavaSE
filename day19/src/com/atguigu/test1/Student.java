package com.atguigu.test1;

import java.io.Serializable;

// 实体类实现可序列化接口
public class Student implements Serializable {
    private String stuName;
    private int stuAge;
    private String stuGender;

    public Student() {
    }

    public Student(String stuName, int stuAge, String stuGender) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuGender = stuGender;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuGender='" + stuGender + '\'' +
                '}';
    }
}
