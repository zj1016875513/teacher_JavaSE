package com.atguigu.test1;

import java.lang.reflect.Field;

// 利用反射的方式获取类类对象代表的类的对象
public class TestFour {
    public static void main(String[] args) {
        /*
        Student stu = new Student();
        stu.setStuName("Tom");
        stu.setStuAge(20);
        stu.setStuGender("男");
        System.out.println(stu.getStuName());
        System.out.println(stu.getStuAge());
        System.out.println(stu.getStuGender());
        */
        try {

            Class classOne = Student.class;
            // Student stu = new Student();
            // Student stu1 = new Student();
            Object obj = classOne.newInstance();
            Object obj1 = classOne.newInstance();
            // stu.stuName获取属性值，fieldOne是属性本身
            Field fieldOne = classOne.getDeclaredField("stuName");
            Field fileTwo = classOne.getDeclaredField("school");
            Field fieldThree = classOne.getDeclaredField("stuAge");
            // stu.stuName = "Tom";
            fieldOne.set(obj,"Tom");
            fieldOne.set(obj1,"Jerry");
            fileTwo.set(obj,"尚硅谷");
            fieldThree.setAccessible(true);// 设置私有属性可以被访问
            fieldThree.set(obj,20);
            // String name = stu.getStuName();
            String name = (String)fieldOne.get(obj1);
            System.out.println(fileTwo.get(obj1));
            System.out.println(name);
            System.out.println(fieldThree.get(obj));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
