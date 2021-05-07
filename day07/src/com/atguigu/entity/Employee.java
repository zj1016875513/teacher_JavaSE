package com.atguigu.entity;

public class Employee {

    private int empNo;
    private String empName;
    private double empSalary;
    private String empGender;

    public Employee() {
    }

    public Employee(int empNo, String empName, double empSalary, String empGender) {
        this.empNo = empNo;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empGender = empGender;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getInfo(){
       return "你好，我的员工编号是:"+empNo+",我的姓名是："
                +empName+",我的工资是："+empSalary+",我的性别是："+empGender;
    }


}
