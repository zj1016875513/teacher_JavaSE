package com.atguigu.entity;

public class CountScore {

    public int countSum(Score score){
        int result = 0;
        result = score.countSum();
        return result;
    }

    public int countAvg(Score score){
        return score.countAvg();
    }

}
