package com.atguigu.test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestOne {
    public static void main(String[] args) {
        /*
        List list = new ArrayList();

        list.add("Tom");
        String s = (String)list.get(0);
        list.add("Jerry");
        list.add(10);

        for (Object o : list) {
            String word = (String)o;
        }
        */

        // 泛型的集合就是在声明集合对象时规定泛型的类型，一旦规定泛型类型，则该集合只能存储当前类型元素
        // List<String> list = new ArrayList<String>();
        // 不推荐使用
        // List<String> list = new ArrayList();// 这种方式并不影响泛型的使用，但是由于堆空间中的集合对象本身没有泛型，存在存储隐患。
        // List<Object> list = new ArrayList<Integer>();// 泛型的引用类型和实际类型必须一致，泛型不支持多态
        List<String> list = new ArrayList<>();// 推荐使用

        list.add("Tom");
        list.add("Jerry");
        list.add("Mary");

        String s = list.get(0);

        for(int i = 0;i < list.size(); i++){
            String word = list.get(i);
            System.out.println(word);
        }

        // 虽然集合泛型了，但是迭代器也需要泛型，否则迭代器读取的元素还是Object
        Iterator<String> iter = list.iterator();

        while(iter.hasNext()){
            String s1 = iter.next();
            System.out.println(s1);
        }

        for (String s1 : list) {
            System.out.println(s1);
        }
    }
}
