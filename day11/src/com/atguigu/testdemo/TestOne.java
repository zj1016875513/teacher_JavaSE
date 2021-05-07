package com.atguigu.testdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestOne {

    @Before
    private void before(){
        System.out.println("before method~~~~~~~~~~~~~~~");
    }

    @Test
    public void testOne(){
        System.out.println("in testOne~~~~~~~~~~~~~~");
    }

    @Test
    public void testTwo(){
        System.out.println("in testTwo~~~~~~~~~~~~~~~~");
    }

    @After
    public void after(){
        System.out.println("after method~~~~~~~~~~~~~~~~~~~");
    }
}
