package com.atguigu.entity;

public class Score {
    public int lang;
    public int math;
    public int english;

    public int countSum(){
        return lang + math + english;
    }

    public int countAvg(){
        return countSum() / 3;
    }
}
