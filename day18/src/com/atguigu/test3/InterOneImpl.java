package com.atguigu.test3;

// 如果一个实现类实现接口是没有指定接口的泛型的具体类型则，使用Object
// public class InterOneImpl implements InterOne {

// 实现类实现接口时直接指定接口泛型的具体类型
// public class InterOneImpl implements InterOne<Integer> {

// 实现类继承接口的泛型，实现类也是泛型的类，创建实现类对象时指定具体的泛型类型，如果不指定则使用Object
public class InterOneImpl<T> implements InterOne<T> {

    @Override
    public void methodOne(T t) {

    }

    @Override
    public T methodTwo() {
        return null;
    }

    @Override
    public T methodThree(T t) {
        return null;
    }
}
