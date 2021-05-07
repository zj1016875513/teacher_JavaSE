package com.atguigu.enumdemo;

public class Student {
    private String stuName;
    private int stuAge;
    private Gender stuGender;

    public Student() {
    }

    public Student(String stuName, int stuAge, Gender stuGender) {
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

    public Gender getStuGender() {
        return stuGender;
    }

    public void setStuGender(Gender stuGender) {
        this.stuGender = stuGender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuGender=" + stuGender +
                '}';
    }

}
