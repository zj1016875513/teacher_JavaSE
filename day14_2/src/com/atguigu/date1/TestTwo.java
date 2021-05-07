package com.atguigu.date1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestTwo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();// 获取当前系统时间
        System.out.println(calendar);
        // System.out.println(System.currentTimeMillis());
        int year = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(year);
        System.out.println("-------------------------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // Date date = calendar.getTime();
        // String strDate = sdf.format(date);
        // System.out.println(strDate);
        System.out.println("----------------------------------------------");
        calendar.add(Calendar.HOUR_OF_DAY,-1000);
        Date date = calendar.getTime();
        String strDate = sdf.format(date);
        System.out.println(strDate);
    }
}