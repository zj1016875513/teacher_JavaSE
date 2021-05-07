package com.atguigu.morningtest;

public abstract class Teacher {
    private String teacherName;
    private int teacherAge;

    public Teacher() {
    }

    public Teacher(String teacherName, int teacherAge) {
        this.teacherName = teacherName;
        this.teacherAge = teacherAge;
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

    public abstract void shangKe();
}
