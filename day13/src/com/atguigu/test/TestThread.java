package com.atguigu.test;

public class TestThread {
    public static void main(String[] args) {
        MyThreadOne mto = new MyThreadOne();
        mto.start();// 开启新的子线程，调用run方法。
        MyThreadTwo mtt = new MyThreadTwo();
        // 由于Runnable接口没有start方法，所以必须有Thread类来调用start方法，将实现接口的类的对象作为创建Thread对象的参数。
        // 当Thread对象调用自己的start方法时，会调用参数的run方法。
        Thread thread = new Thread(mtt);
        thread.start();
        for(int i = 0;i < 100; i++){
            System.out.println(i+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        }
    }
}
