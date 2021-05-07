package com.atguigu.test2;

import java.math.BigInteger;

public class TestTwo {
    public static void main(String[] args) {
        // long one = 87987878233342345676876876L;
        // System.out.println(one);
        BigInteger bigIntegerOne = new BigInteger("87987878233342345676876876");
        System.out.println(bigIntegerOne);
        BigInteger bigIntegerTwo = new BigInteger("3567388574689958476858");
        System.out.println("和："+bigIntegerOne.add(bigIntegerTwo));
        System.out.println("减："+bigIntegerOne.subtract(bigIntegerTwo));
        System.out.println("乘："+bigIntegerOne.multiply(bigIntegerTwo));
        System.out.println("除："+bigIntegerOne.divide(bigIntegerTwo));
        System.out.println("余："+bigIntegerOne.remainder(bigIntegerTwo));
    }
}
