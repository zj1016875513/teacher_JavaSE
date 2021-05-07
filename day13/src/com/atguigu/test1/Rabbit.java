package com.atguigu.test1;

public class Rabbit extends Thread {
    @Override
    public void run() {
        for(int i = 1;i <= 30; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(i == 30){
                System.out.println("兔子已经跑到了终点-------------------------");
                break;
            }

            System.out.println("兔子向前跑了一米++++++++++++++++++++++++++++++");

            if(i % 10 == 0){
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
