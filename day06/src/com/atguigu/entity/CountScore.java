package com.atguigu.entity;

public class CountScore {

    // java的方法没有参数个数的限制
    public int countSum(int lang,int math,int english){
        int result = 0;
        result = lang + math + english;
        return result;
    }

    public int countAvg(int lang,int math,int english){
        int result = 0;
        // result = (lang+math+english) / 3;
        result = countSum(lang,math,english) / 3;// 当同一个类的方法互相访问时，可以直接调用方法名
        return result;
    }
}
