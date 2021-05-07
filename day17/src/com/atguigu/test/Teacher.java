package com.atguigu.test;

public class Teacher {
    private String teacherName;
    private int teacherAge;
    private String teacherGender;

    public Teacher() {
    }

    public Teacher(String teacherName, int teacherAge, String teacherGender) {
        this.teacherName = teacherName;
        this.teacherAge = teacherAge;
        this.teacherGender = teacherGender;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(int teacherAge) {
        this.teacherAge = teacherAge;
    }

    public String getTeacherGender() {
        return teacherGender;
    }

    public void setTeacherGender(String teacherGender) {
        this.teacherGender = teacherGender;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", teacherAge=" + teacherAge +
                ", teacherGender='" + teacherGender + '\'' +
                '}';
    }



}
