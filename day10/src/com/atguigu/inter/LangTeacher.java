package com.atguigu.inter;

// 一个类通过implements关键字实现一个接口，那么它必须实现这个接口中的所有抽象方法
// 一个实现了接口，并实现了接口中所有抽象方法的类叫做这个接口的实现类
public class LangTeacher implements Teacher{

    @Override
    public void shangKe() {
        System.out.println("上语文课");
    }
}
