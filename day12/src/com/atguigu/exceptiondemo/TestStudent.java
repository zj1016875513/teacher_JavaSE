package com.atguigu.exceptiondemo;

public class TestStudent {
    public static void main(String[] args){
        Student stu = new Student();
        stu.setStuName("Tom");


        try {
            stu.setStuAge(17);
        } catch (StuAgeException e) {
            e.printStackTrace();
        }

        /*
        try {
            Class.forName("");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        */

    }
}
