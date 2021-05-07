package com.atguigu.test;

import java.util.Objects;

public class Student implements Comparable{
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

    @Override
    public int compareTo(Object o) {
        int result = 0;
        Student stu = (Student)o;
        result = this.getStuName().compareTo(stu.getStuName());
        if(result == 0){
            result = this.getStuAge() - stu.getStuAge();
        }
        if(result == 0){
            result = this.getStuGender().compareTo(stu.getStuGender());
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stuAge == student.stuAge &&
                stuName.equals(student.stuName) &&
                stuGender.equals(student.stuGender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuName, stuAge, stuGender);
    }
}
