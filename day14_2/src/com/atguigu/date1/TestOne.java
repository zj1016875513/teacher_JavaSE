package com.atguigu.date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestOne {
    public static void main(String[] args) {

        Date date = new Date();// 利用创建对象时的系统时间创建一个时间对象
        System.out.println(date);
        int year = date.getYear();
        System.out.println(year);
        System.out.println(date.getMonth());
        System.out.println(date.getDate());
        System.out.println(date.getDay());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(date);
        System.out.println(dateStr);

    }
}
