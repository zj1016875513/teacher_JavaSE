package com.atguigu.exceptiondemo;

// 自定义异常类继承自Exception,RuntimeException
public class StuAgeException extends Exception {

    public StuAgeException(){

    }

    // 在没有重写getMessage的情况下，可以通过构造方法传递String参数的方法设置异常信息，构造方法传递优先级低于getMessage
    public StuAgeException(String info){
        super(info);
    }

    // 自定义异常来，可以通过重写getMessage方法来打印自己的异常信息，getMessage方法的优先级高于构造方法传参
    /*
    @Override
    public String getMessage() {
        return "学员年龄必须在18到40之间";
    }
    */
}
