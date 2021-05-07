package com.atguigu.tuxing;

public class TestRectange {
    public static void main(String[] args) {
        Rectange aa=new Rectange("长方形");
        aa.setLength(20);
        aa.setWidth(10);
        String bb=aa.getInfo();
        System.out.println(bb);
    }
}
