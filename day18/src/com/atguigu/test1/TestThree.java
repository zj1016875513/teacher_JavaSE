package com.atguigu.test1;

import java.util.*;

public class TestThree {
    public static void main(String[] args) {
        Student stu = new Student("Tom",20,"男");
        Student stu1 = new Student("Jerry",21,"男");
        Student stu2 = new Student("Bob",22,"男");

        Map<String,Student> map = new HashMap<>();

        map.put(stu.getStuName(),stu);
        map.put(stu1.getStuName(),stu1);
        map.put(stu2.getStuName(),stu2);

        Student student = map.get(stu.getStuName());//通过key取value；

        System.out.println(student);
        System.out.println(map);


        Set<String> keys = map.keySet();//将map的key赋给Set类型的keys，set类型是keySet（）方法指定的类型。
        System.out.println(keys);
        Collection<Student> value = map.values();//将map的value值赋给Collection类型的value，Collection类型是values()方法指定的类型。
        System.out.println(value);

        Set<Map.Entry<String,Student>> entrySet = map.entrySet();//返回map里的键值对
        System.out.println(entrySet);

//        Set<String,Student> aa=map.entrySet();
    }
}
