package com.atguigu.entity;

public class TestEmp {
    public static void main(String[] args) {

        Employee emp = new Employee(1,"Tom",20000.0,"男");
        System.out.println(emp.getEmpName());
        System.out.println(emp.getInfo());

    }
}
