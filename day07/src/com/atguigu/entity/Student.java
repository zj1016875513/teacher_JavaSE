package com.atguigu.entity;

public class Student {
    private String stuName;
    private int stuAge;
    private String stuGender;

    // 如果类中有任何一个显示有参的构造方法，需要把无参构造方法写出来
    public Student(){
    }
    // 构造方法没有返回类型，构造方法和类同名
    // 构造方法只能在创建对象时调用，创建对象必须调用构造方法。
    // 如果一个java类没有任何一个显示的构造方法，那么这个类拥有一个隐示无参的构造方法
    // 如果一个java类中编写了任何一个显示的构造方法，那么这个隐示无参的构造方法就会消失
    public Student(String stuName,int stuAge,String stuGender){
        this.stuName = stuName;
        setStuAge(stuAge);
        this.stuGender = stuGender;
    }

    public Student(String stuName,int stuAge){
        this.stuName = stuName;
        this.setStuAge(stuAge);
    }

    public String getStuName(){
        return stuName;
    }

    public void setStuName(String stuName){
        // 局部变量可以和属性重名，局部变量拥有更高的优先级
        // 在局部变量和属性重名时，需要访问属性，则需要使用this关键调用属性
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        if(stuAge >= 18 && stuAge <= 40) {
            this.stuAge = stuAge;
        }else{
            this.stuAge = 18;
        }
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public void sayHello(){
        System.out.println("你好，我叫"+stuName+",我今年"+stuAge+",我是一名"+stuGender+"同学");
    }

    // 方法重载必须在同一个类中，方法名相同，参数组不同(参数类型不同，参数个数不同，参数顺序不同)
    // 方法重载是多个方法
    public void sayHello(String name){
        System.out.println("你好，亲爱的"+name+",我叫"+stuName+",我今年"+stuAge+",我是一名"+stuGender+"同学");
    }

}
