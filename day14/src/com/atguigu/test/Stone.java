package com.atguigu.test;

public class Stone {

    private int items = 5;

    // 生产商品
    public void add(){
        synchronized (this) {
            if (items >= 20) {
                System.out.println("商品数量已达上限，生产线程暂停，让消费线程消费");
                try {
                    this.wait();// 当前线程处于等待状态，一个线程处于wait状态后，需要其他线程唤醒。调用wait和notify的应该是锁对象
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("生产线程正在生产，现在的产品数量是：" + (++items) + "~~~~~~~~~~~~~~~~~~~~~~~~");
            this.notify();// 随机唤醒一个处于wait的线程
        }
    }

    // 消费商品
    public void get(){
        synchronized (this) {
            if (items <= 0) {
                System.out.println("商品数量已达到下线，消费线程暂停，让生产线程生产");
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费线程正在消费，现在的产品数量是：" + (--items) + "~~~~~~~~~~~~~~~~~~~~~~~~");
            this.notify();
        }
    }


}
