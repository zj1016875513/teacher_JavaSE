package com.atguigu.morningtest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestTwo {
    public static void main(String[] args) {
        // jdk1.8之后
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        int month = localDate.getMonth().getValue();
        int day = localDate.getDayOfMonth();

        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();
        int mins = localTime.getMinute();
        int second = localTime.getSecond();
        int naon = localTime.getNano();

        LocalDateTime localDateTime = LocalDateTime.now();
    }
}
