package com.atguigu.zoo;

public class TestDog {
    public static void main(String[] args) {
        Cat cat = new Cat();
        // cat.name;// 父类私有的属性和方法可以继承到，但是不能直接调用。
        cat.setName("Tom");
        System.out.println(cat.getName());
        cat.play();
        Dog dog = new Dog();
        dog.play();
        System.out.println("-------------------------------");
        Cat cat1 = new Cat("小强",4,"公的","波斯猫");
        System.out.println(cat1.getName());
    }
}
