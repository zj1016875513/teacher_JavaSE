package com.atguigu.test;

public class MyThreadOne extends Thread {
    @Override
    public void run() {
        // 重写run方法，在run方法中编写需要开启新的线程执行的代码
        for(int i = 0;i < 100; i++){
            System.out.println(i+"===============================");
        }
    }
}
