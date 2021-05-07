package com.atguigu.entity;

public class CalcOne {

    public int count(int one,int two,String opert){
        int result = 0;

        if("+".equals(opert)){
            result = one + two;
        }else if("-".equals(opert)){
            result = one - two;
        }else if("*".equals(opert)){
            result = one * two;
        }else if("/".equals(opert)){
            result = one / two;
        }

        return result;
    }

}
