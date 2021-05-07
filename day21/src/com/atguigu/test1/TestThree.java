package com.atguigu.test1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

//  Class类的常用方法2
public class TestThree {
    public static void main(String[] args) {
        try{
            Class classOne = Student.class;

            Method[] methods = classOne.getMethods();// 获取所有public修饰的方法，不仅限于本类，包括继承到的方法
            // Method[] methods = classOne.getDeclaredMethods();// 获取本类所有修饰符修饰的方法，仅限本类。
            for (Method method : methods) {
                String mod = Modifier.toString(method.getModifiers());//获取修饰符
//                Class type = method.getReturnType();//获取返回值类型
//                String typeName = type.getSimpleName();//获取当前类类对象代表的类的类名不包含包名
                String typeName = method.getReturnType().getSimpleName();
//                System.out.println(type);
//                System.out.println(typeName);
                String methodName = method.getName();// 获取当前类类对象代表的类的完整类名
                Parameter[] parameters = method.getParameters();//获取参数
                String info = mod+" "+typeName+" "+methodName+"(";
                for (int i = 0; i < parameters.length; i++) {

                    if(i == parameters.length-1){
                        info += parameters[i].getName();
                    }else{
                        info += parameters[i].getName()+",";
                    }
                }
                info += ")";
                System.out.println(info);
            }
            System.out.println("++++++++++++++++++");
            // 精确获取一个方法，需要方法名和参数组两部分，如果没有参数，则只需要方法名，如果有参数则需要将每个参数的类类对象传入
            Method method = classOne.getDeclaredMethod("study",String.class,String.class);
            System.out.println(method);
            System.out.println("----------------------------------------------");
            // Constructor[] constructors = classOne.getConstructors();// 获取本类所有public修饰的构造方法
            Constructor[] constructors = classOne.getDeclaredConstructors();// 获取本类所有修饰的构造方法

            Constructor constructor = classOne.getConstructor(String.class,int.class,String.class);
            String mod = Modifier.toString(constructor.getModifiers());// 获取构造方法的访问修饰符
            Parameter[] parameters = constructor.getParameters();// 获取构造方法的参数组
            System.out.println(mod);
            System.out.println(constructor);


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
