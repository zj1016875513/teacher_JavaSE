package com.atguigu.tuxing;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle("圆形");
        circle.setRadius(12.5);
//        double mianji = circle.getArea();
//        double zhouchang = circle.getPerimeter();
//        System.out.println("面积："+mianji+",周长:"+zhouchang);
        String word = circle.getInfo();
        System.out.println(word);
    }
}
