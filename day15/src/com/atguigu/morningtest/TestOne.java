package com.atguigu.morningtest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestOne {
    public static void main(String[] args) {
        // jdk1.8之前的日期处理
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String strDate = sdf.format(date);
        System.out.println(strDate);

        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR);
        System.out.println(hour);
    }
}
