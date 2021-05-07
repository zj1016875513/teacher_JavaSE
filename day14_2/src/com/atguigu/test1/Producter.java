package com.atguigu.test1;

public class Producter extends Thread {
    private Stone stone;

    public Producter(Stone stone){
        this.stone = stone;
    }
    @Override
    public void run() {
       while(true){
           stone.add();
       }
    }
}
