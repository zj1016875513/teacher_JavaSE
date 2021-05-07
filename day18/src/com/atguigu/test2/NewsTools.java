package com.atguigu.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsTools {

    public static Map<String, List<News>> getAllNews(){
        Map<String, List<News>> map = new HashMap<>();

        News news = new News("嫦娥5号顺利返回","小强","如题");
        News news1 = new News("全国人民喜迎圣诞节","小明","如题");
        News news2 = new News("英国封城","Jerry","如题");
        News news3 = new News("美国大选","Mary","如题");

        List<News> list = new ArrayList<>();
        list.add(news);
        list.add(news1);

        List<News> list1 = new ArrayList<>();
        list1.add(news2);
        list1.add(news3);

        map.put("国际新闻",list1);
        map.put("国内新闻",list);


        return map;
    }

}
