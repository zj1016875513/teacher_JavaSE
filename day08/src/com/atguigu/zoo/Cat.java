package com.atguigu.zoo;

// Cat类继承自Pet类，Cat是子类，Pet是父类
// 子类可以继承到父类所有的属性和方法，构造方法不能继承
// java语言采用单继承体系(一个类只能有一个父类)
public class Cat extends Pet{

    // 子类独有的属性
    private String type;

    public Cat() {
        // 子类构造方法中必须在构造方法的第一行，调用父类的构造方法
        // 如果没有显示写出调用哪个构造方法，则隐示调用父类无参的构造方法
        super();
    }

    public Cat(String name,int age,String gender,String type) {
        super(name,age,gender);
        /*
        super();
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        */
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void play(){
        System.out.println("玩儿毛线球");
    }
}
