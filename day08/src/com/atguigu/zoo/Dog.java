package com.atguigu.zoo;

public class Dog extends Pet{

    public Dog(){
        super("旺财",3,"母的");
    }

    // 子类独有的方法
    public void work(){
        System.out.println("工作");
    }

    // 方法重写发生在父子类中，子类编写方法重写父类的方法。
    // 子类编写一个和父类方法签名一模一样的方法，子类重写了父类的方法
    // 子类一旦重写父类的方法，那么再调用的一定是子类重写的方法
    // 子类一旦重写父类的方法，只有一个机会可以调用父类的方法，在子类类中使用super关键字调用
    // 子类重写的方法的访问修饰符只能比父类的方法的访问修饰符更宽，不能更窄。
    // 如果父类的返回类型是void或者基础数据类型，那么子类的返回类型必须和父类一致。
    // 如果父类的返回类型是引用数据类型，那么子类重写方法的返回类型可以是父类返回类型的子类型
    @Override
    public void play(){
        super.play();
        // this.play();
        System.out.println("玩儿丢飞盘");
    }

}
