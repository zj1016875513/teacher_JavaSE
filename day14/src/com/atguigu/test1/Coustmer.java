package com.atguigu.test1;

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
