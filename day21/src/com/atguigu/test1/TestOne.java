package com.atguigu.test1;

// 获取类类对象的四种方式
public class TestOne {
    public static void main(String[] args) {
        // 使用类名获取该类的类类对象
        Class classOne = Student.class;
        System.out.println(classOne.getName());

        // 使用对象获取该对象的类的类类对象
        Student stu = new Student();
        Class classTwo = stu.getClass();

        // 使用完整类名字符串获取该类的类类对象
        try {
            Class classThree = Class.forName("com.atguigu.test1.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 使用类加载器获取类类对象
        try {
            Class classFour = Student.class.getClassLoader().loadClass("com.atguigu.test1.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
