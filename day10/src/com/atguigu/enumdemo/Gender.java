package com.atguigu.enumdemo;

// 本类演示jdk1.5之后的枚举类
// 使用enum关键字声明的枚举类默认继承自Enum类
public enum Gender {

    // enum声明的枚举类中，必须在类体的第一部分声明该类型的常量属性
    // enum类在类体的第一部分声明常量属性，多个常量属性间需要用逗号分隔，最后一个常量属性后用分号结束

    WEMON("女"),
    MAN("男");

    private String info;
    // enum声明的枚举类中，所有的构造方法默认是私有访问修饰，不能改成其他访问修饰
    private Gender(String info){
        this.info = info;
    }


    @Override
    public String toString() {
        return info;
    }
}
