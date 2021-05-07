package com.atguigu.test1;

public class SellTicketOne extends Thread {

    private static int tickets = 100;
    private static Object lock = new Object();

    @Override
    public void run() {

        while(true){
            // synchronized (lock) {
            // synchronized ("lock") {
            synchronized (SellTicketOne.class) {
                if (tickets <= 0) {
                    System.out.println("票已售完~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + "线程正在售出一张电影票，当前票剩余" + (--tickets) + "张票");
            }
        }
    }
}
