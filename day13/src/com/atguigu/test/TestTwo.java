package com.atguigu.test;

public class TestTwo {
    public static void main(String[] args) {
        MyThreadOne mto = new MyThreadOne();
        MyThreadOne mto1 = new MyThreadOne();

        // mto.run();// 运行子线程的代码
        // mto.start();// 开启新的线程，运行run方法

        mto.setName("第一个子线程");// 设置当前线程的名称
        mto1.setName("第二个子线程");
        System.out.println(mto.getName());// 获取当前线程名称
        System.out.println(mto1.getName());

        mto.setPriority(Thread.NORM_PRIORITY);// 设置当前线程的优先级,优先级参数从1-10,1优先级最低，10优先级最高，5是线程默认优先级
        int i = mto.getPriority();// 获取当前线程的优先级
        System.out.println(i);
        System.out.println(mto1.getPriority());
        System.out.println(mto.isAlive());// 测试当前线程是否激活
        System.out.println("-----------------------------");
        MyThreadTwo mtt = new MyThreadTwo();
        System.out.println(Thread.currentThread().getName());
        new Thread(mtt).start();

    }
}
