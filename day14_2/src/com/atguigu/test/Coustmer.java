package com.atguigu.test;

public class Coustmer extends Thread {
    private Stone stone;

    public Coustmer(Stone stone){
        this.stone = stone;
    }

    @Override
    public void run() {
       while(true){
           stone.get();
       }
    }
}
