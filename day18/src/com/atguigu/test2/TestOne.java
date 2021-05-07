package com.atguigu.test2;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要查看的版块名称");
        String name = input.next();

        Map<String, List<News>> map = NewsTools.getAllNews();
        List<News> list = map.get(name);

        for (News news : list) {
            System.out.println(news);
        }
    }
}
