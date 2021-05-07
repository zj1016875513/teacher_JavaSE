package com.atguigu.test1;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestTwo {
    public static void main(String[] args) {
        try{
            Class classOne = Student.class;// 获取类类对象

            System.out.println(classOne.getName());// 获取当前类类对象代表的类的完整类名
            System.out.println(classOne.getPackage().getName());// 获取当前类类对象代表的类的所在包对象再获取包名
            System.out.println(classOne.getSimpleName());// 获取当前类类对象代表的类的类名不包含包名
            System.out.println("----------------------------------------");
//             Field[] fields = classOne.getFields();// 获取当前类类对象的所有  public  修饰的属性,但不仅限于本类，包括从父类继承到的public属性
            Field[] fields = classOne.getDeclaredFields();// 获取当前类类对象的所有的访问修饰符的属性，只能获取本类的属性
//            System.out.println(fields.length);
            for (Field field : fields) {
                System.out.println(Modifier.toString(field.getModifiers()));// 获取属性的访问修饰符，toString将常量值变成修饰符
                System.out.println(field.getModifiers());//获取修饰符常量值
                Class type = field.getType();// 获取该属性的类型
//                System.out.println(type);
                System.out.println(type.getSimpleName());
                System.out.println(field.getName());// 获取属性名
                System.out.println("********************");
            }
            System.out.println("++++++++++++++++++++++++++++");
            // Field field1 = classOne.getField("one");// 获取本类及继承到指定参数名的public修饰的属性
            Field field1 = classOne.getDeclaredField("stuAge");// 获取本类的所有的访问修饰的指定参数名的属性
            System.out.println(field1.getName());

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
