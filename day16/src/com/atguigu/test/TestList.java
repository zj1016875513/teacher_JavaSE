package com.atguigu.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        // List接口是有序的(新增顺序和遍历顺序一致)
        // List允许重复记录
        // List接口元素是有索引的
        List list = new ArrayList();
        List listOne = new ArrayList();
        listOne.add("三毛");
        listOne.add("光头强");
        listOne.add("熊大");
        System.out.println(list.size());
        list.add("Tom");
        list.add("Jerry");
        list.add("Mary");
        list.add("Mary");

        // 使用指定索引插入数据的方式，不允许插队索引大于当前集合的长度
        list.add(4,"小明");

        list.addAll(2,listOne);

        System.out.println(list.size());

        for(Object o : list){
            System.out.println(o);
        }
        System.out.println("-------------------------------------");
        Iterator iter = list.iterator();
        while(iter.hasNext()){
            Object o = iter.next();
            System.out.println(o);
        }

        System.out.println("------------------------------");
        // get方法使用参数索引获取该索引位置的集合元素
        String s = (String)list.get(1);
        System.out.println(s);
        for(int i = 0;i < list.size(); i++){
            Object o = list.get(i);
            System.out.println(o);
        }
        System.out.println("-----------------------------");
        // 返回参数元素在集合中第一次出现的索引位置，如果集合中不包含该元素则返回-1
        int index = list.indexOf("liudehua");
        System.out.println(index);

        // 按照参数对象在集合中删除第一次出现的元素
        list.remove("Mary");
        System.out.println(list);
        // 移除参数下标位置的元素
        list.remove(1);
        System.out.println(list);
        System.out.println("----------------------------------");
        List listTwo = new ArrayList();
        listTwo.add(1);
        listTwo.add(2);
        listTwo.add(3);
        System.out.println(listTwo);
        listTwo.remove(new Integer(1));// list的remove方法，在移除时优先使用下标作为移除参数
        System.out.println(listTwo);
        System.out.println("----------------------------------");
        System.out.println(list.size());
        System.out.println(list);
        list.set(2,"黑猫警长");// 用第二个参数元素，替换第一个参数位置的元素
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("-----------------------------------");
        List subList = list.subList(2,5);
        for(Object o : subList){
            System.out.println(o);
        }
    }
}
