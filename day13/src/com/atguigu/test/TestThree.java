package com.atguigu.test;

public class TestThree {
    public static void main(String[] args) {
        for(int i = 10;i >= 0; i--){
            try {
                Thread.sleep(1000);// 使当前线程进入休眠状态，参数是休眠的时间，单位为毫秒，休眠时间到期，线程唤醒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+"~~~~~~~~~~~~~~~~~~~~");
        }
        System.out.println("新年快乐");
    }
}
