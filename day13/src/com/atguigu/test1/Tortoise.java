package com.atguigu.test1;

public class Tortoise extends Thread {
    @Override
    public void run() {
        for(int i = 1;i <= 30; i++){// 循环30次，每次代表跑一米
            try {
                Thread.sleep(1000);// 休眠一秒钟代表每一秒跑一米
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(i == 30){
                System.out.println("乌龟已经跑到了终点=============================");
                break;
            }

            System.out.println("乌龟跑了一米~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            if(i % 10 == 0){
                try {
                    Thread.sleep(1000);// 每跑10米，乌龟休眠一秒钟
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
