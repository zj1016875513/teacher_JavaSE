package com.atguigu.morningtest;

import java.util.*;

public class TestOne {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Tom");
        list.add("Jerry");
        list.add("Mary");
        list.add("Jack");
//        System.out.println(list.contains("Tom"));


        Iterator iter = list.iterator();

        while(iter.hasNext()){
            String s = (String)iter.next();
            System.out.println(s);
        }
    }
}
