package com.atguigu.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSeven {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Tom");
        list.add("Jerry");
        System.out.println(list);
        System.out.println(list.get(1));
        // 将多个元素一次性添加到一个集合中
        Collections.addAll(list,"Mary","Jack","June");
        System.out.println(list);


        // 反转集合元素
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("--------------------------------------");
        // 随机排列集合中的元素
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("----------------------------------------");
        Collections.sort(list);
        System.out.println(list);
        // 二分查找的方式在List集合中查找参数元素的索引
         int index = Collections.binarySearch(list,"June");
         System.out.println(index);

         // 交换两个索引位置的元素
         Collections.swap(list,0,2);
         System.out.println(list);

    }
}
