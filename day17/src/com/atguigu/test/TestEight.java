package com.atguigu.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestEight {
    public static void main(String[] args) {
        // Map的常用方法
        Map map = new HashMap();

        map.put("班长","美国");// 将元素存储到Map集合中,两个参数，前键后值。
        map.put("学委","中国");
        map.put("体委","俄罗斯");
        map.put("文委","意大利");
        System.out.println(map.size());
        map.put("班长","联合国");// 当向Map集合中添加键相同的元素时，新的值会替换老的值
        System.out.println(map.size());
        System.out.println(map);

        String value = (String)map.get("班长");// 使用键作为参数获取值
        System.out.println(value);

        map.remove("班长");// 使用键作为参数，移除整个键值对
        System.out.println(map);
        System.out.println("-------------");
        System.out.println(map.isEmpty());
        System.out.println("---------");
        System.out.println(map.containsKey("学委"));// 检索当前集合中是否存在参数键
        System.out.println(map.containsValue("中国"));// 检索当前集合中是否存在参数值
        System.out.println("***********");
        // map.clear();// 清空所有的元素

        Set keys = map.keySet();// 返回当前Map集合中所有的键集

        Iterator iter = keys.iterator();
        while(iter.hasNext()){
            String key = (String)iter.next();
            String val = (String)map.get(key);
            System.out.println(key+"="+val);
        }

        for (Object key : keys) {
            String val = (String)map.get(key);
            System.out.println(key+"="+val);
        }

        Set entrySets = map.entrySet();// 获取当前Map集合中的键值对对象集

        for (Object o : entrySets) {
            Map.Entry entry = (Map.Entry)o;
            String key = (String)entry.getKey();
            String val = (String)entry.getValue();
            System.out.println(key+"="+val);
        }

    }
}
