package com.atguigu.test;

public class TestOne {
    public static void main(String[] args) {
        MyThreadTwo mtt = new MyThreadTwo();
        MyThreadOne mto = new MyThreadOne(mtt);
        mto.start();
        mtt.start();
    }
}

class MyThreadOne extends Thread{
    private MyThreadTwo myThreadTwo;

    public MyThreadOne(MyThreadTwo myThreadTwo){
        this.myThreadTwo = myThreadTwo;
    }
    @Override
    public void run() {
        for(int i = 0;i < 100; i++){
            if(i == 20){
                try {
                    myThreadTwo.join();// 让myThreadTwo线程插队，先执行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(this.getName()+":"+i+"=================================");
        }
    }
}

class MyThreadTwo extends Thread{
    @Override
    public void run() {
        for(int i = 0;i < 100; i++){
            System.out.println(this.getName()+":"+i+"~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
