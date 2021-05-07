package com.atguigu.test1;

public class TestSellTickets {
    public static void main(String[] args) {
        SellTicketOne sto1 = new SellTicketOne();
        SellTicketOne sto2 = new SellTicketOne();
        SellTicketOne sto3 = new SellTicketOne();

        sto1.start();
        sto2.start();
        sto3.start();
    }
}
