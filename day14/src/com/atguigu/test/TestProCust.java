package com.atguigu.test;

public class TestProCust {
    public static void main(String[] args) {
        Stone sto = new Stone();
        Coustmer coustmer = new Coustmer(sto);
        Producter producter = new Producter(sto);
        coustmer.start();
        producter.start();
    }
}
