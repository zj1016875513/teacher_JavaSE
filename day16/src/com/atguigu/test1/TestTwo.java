package com.atguigu.test1;

import java.util.LinkedList;
import java.util.List;

public class TestTwo {
    public static void main(String[] args) {
        // LinkedList底层使用双向链表实现
        // 双向链表的特点决定了LinekedList频繁存取的效率高，遍历查询的效率低。
        // 数组的特点决定了ArrayList频繁存取的效率低，遍历查询的效率高。
        LinkedList list = new LinkedList();

        list.add("Tom");
        list.add("Jerry");
        list.add("Mary");

        System.out.println(list);
        // LinkedList拥有一套对首尾元素单独操作的方法
        list.addFirst("xiaoming");
        list.addLast("xiaoqiang");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
