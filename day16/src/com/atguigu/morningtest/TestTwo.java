package com.atguigu.morningtest;

public class TestTwo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("One");
        stringBuilder.append(" ").append("World").append(" ");
        stringBuilder.append("One").append(" Dream!");
        String word = stringBuilder.toString();
        System.out.println(word);
    }
}
