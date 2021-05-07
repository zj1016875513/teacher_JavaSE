package com.atguigu.test;

public class MyThreadTwo implements Runnable {

    @Override
    public void run() {
        Thread.currentThread().setName("mtt线程");
        Thread.currentThread().setPriority(10);
        for(int i = 0;i < 100; i++){
            System.out.println(Thread.currentThread().getName()+":"+i+"---------------------------------");
        }
    }
}
