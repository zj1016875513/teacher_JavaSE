package com.atguigu.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestSix {
    public static void main(String[] args) {
        // 由TreeSet对象提供排序规则的方式被称作定制排序
        Set set = new TreeSet(new Comparator() {
            // compare方法返回0，代表两个参数对象相等。
            // compare方法返回负数，代表两个参数对象第一个对象小，第二个对象大
            // compare方法返回正数，代表两个参数对象第一个对象大，第二个对象小
            @Override
            public int compare(Object o1, Object o2) {
                Teacher teacher1 = (Teacher)o1;
                Teacher teacher2 = (Teacher)o2;
                int result = 0;
                result = teacher1.getTeacherName().compareTo(teacher2.getTeacherName());
                if(result == 0){
                    result = teacher1.getTeacherAge() - teacher2.getTeacherAge();
                }
                if(result == 0){
                    result = teacher1.getTeacherGender().compareTo(teacher2.getTeacherGender());
                }
                return result;
            }
        });

        Teacher teacher = new Teacher("小白",30,"男");
        Teacher teacher1 = new Teacher("小黑",31,"男");
        Teacher teacher2 = new Teacher("小红",28,"女");
        Teacher teacher3 = new Teacher("小绿",29,"女");
        Teacher teacher4 = new Teacher("小绿",28,"女");

        set.add(teacher);
        set.add(teacher1);
        set.add(teacher2);
        set.add(teacher3);
        set.add(teacher4);

        for (Object o : set) {
            System.out.println(o);
        }

    }
}
