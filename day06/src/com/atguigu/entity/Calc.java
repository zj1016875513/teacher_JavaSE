package com.atguigu.entity;

public class Calc {

    public int one;
    public int two;
    public String opert;

    // return关键字有两个作用，第一个作用是在有返回类型的方法中返回值。
    // 第二个作用是提前结束方法
    public int count(){
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
