package com.atguigu.test1;

public class TestSellTiecktTwo {
    public static void main(String[] args) {
        SellTicketTwo stt = new SellTicketTwo();

        new Thread(stt).start();
        new Thread(stt).start();
        new Thread(stt).start();
    }
}
