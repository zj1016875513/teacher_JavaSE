package com.atguigu.test1;

public class SellTicketTwo implements Runnable {
    private int tickets = 100;
    private Object lock = new Object();

    @Override
    public void run() {

        while(true){
            synchronized (this) {
                if (tickets <= 0) {
                    System.out.println("票已售完~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "线程正在售出一张电影票，当前票剩余" + (--tickets) + "张票");
            }
        }
    }
}
