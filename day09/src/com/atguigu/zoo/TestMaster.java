package com.atguigu.zoo;

public class TestMaster {
    public static void main(String[] args) {
        Master master = new Master();
        Pet pet = new Pet();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        // 父类的引用，传递子类的对象
        Pet pet1 = new Dog();

        master.playWithPet(dog);
    }
}
