package com.atguigu.entity;

public class CountScoreOne {

    // java的方法没有参数个数的限制
    public int countSum(Score score){
        int result = 0;
        result = score.lang + score.math + score.english;
        return result;
    }

    public int countAvg(Score score){
        int result = 0;
        // result = (lang+math+english) / 3;
        // result = score.lang + score.math + score.english / 3;// 当同一个类的方法互相访问时，可以直接调用方法名
        result = countSum(score) / 3;
        return result;
    }
}
