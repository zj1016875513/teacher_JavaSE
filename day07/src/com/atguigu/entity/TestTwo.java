package com.atguigu.entity;

public class TestTwo {
    public static void main(String[] args) {
        Employee[] emps = new Employee[3];
//有参数的构造方法给数组个体赋值；
        emps[0] = new Employee(1,"小明",1500,"男");
        emps[1] = new Employee(2,"小强",2000,"女");
        emps[2] = new Employee(3,"三毛",3000,"男");

        for(int i = 0;i < emps.length; i++){
            // System.out.println(emps[i].getInfo());
            System.out.println(emps[i].getEmpName());// 对象数组的一个元素就是该数组类型的一个对象
        }

//        emps[0] = new Employee();
//        System.out.println(emps[0]);
//        System.out.println(emps[0].getEmpName());
    }
}
