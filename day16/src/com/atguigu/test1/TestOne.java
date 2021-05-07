package com.atguigu.test1;

import java.util.ArrayList;
import java.util.List;

public class TestOne {
    public static void main(String[] args) {
        // ArrayList底层使用可变长度数组实现
        // ArrayList从jdk1.8开始构造方法将不会为保存元素的数组初始化长度
        List list = new ArrayList();

        // ArrayList从jdk1.8开始的第一次调用添加方法，将初始化保存元素的数组，初始化长度为10
        // ArrayList底层使用可变长度的Object数组，当数组元素已满时，数组需要扩容。
        // 扩容按照数组原长度的1.5倍扩容
        list.add("Tom");
    }
}
