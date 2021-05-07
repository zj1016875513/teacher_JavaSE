package com.atguigu.TT;


interface A{
    public default void d(){
        System.out.println("今晚7点-8点陪我吃饭看电影");
    }
}
interface B{
    public default void d(){
        System.out.println("今晚7点-8点陪我逛街吃饭");
    }
}

