package com.atguigu.zoo;

public class Master {

    // 多态形成有三个必要条件：1、有继承，父类定义方法，子类重写方法。
    // 2、父类的引用指向子类的对象
    // 3、可以使用参数传递时多态，也可以直接创建对象时多态
    public void playWithPet(Pet pet){
        pet.play();
    }


}
