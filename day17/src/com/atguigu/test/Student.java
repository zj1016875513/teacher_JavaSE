package com.atguigu.test;

import java.util.Objects;

// 一个类的对象向比较大小需要实现Comparable接口
public class Student implements Comparable{
    private String stuName;
    private int stuAge;
    private String stuGender;

    public Student() {
    }

    public Student(String stuName, int stuAge, String stuGender) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuGender = stuGender;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuGender='" + stuGender + '\'' +
                '}';
    }

    /*
    @Override
    public int hashCode() {
        int code = this.getStuName().hashCode() + new Integer(this.getStuAge()).hashCode() + this.getStuGender().hashCode();
        System.out.println("in hashCode~~~~ code="+code);
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        if(this == obj){
            flag = true;
        }else{
            if(obj instanceof Student){
                Student stu = (Student)obj;
                if(this.getStuName().equals(stu.getStuName())
                        &&this.getStuAge()==stu.getStuAge()
                        &&this.getStuGender().equals(stu.getStuGender())){
                    flag = true;
                }
            }
        }
        System.out.println("in equals~~~~~~~ flag="+flag);
        return flag;
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stuAge == student.stuAge &&
                stuName.equals(student.stuName) &&
                stuGender.equals(student.stuGender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuName, stuAge, stuGender);
    }

    // 调用方法的对象和参数对象比较大小
    // 如果返回值为0，则代表两个对象相等，返回负数代表调用方法的对象小，参数对象大
    // 返回正数则代表调用方法的对象大参数对象小
    @Override
    public int compareTo(Object o) {
//        System.out.println("***");
        int result = 0;
        Student stu = (Student)o;
//        if(this.getStuAge() < stu.getStuAge()){
//            return 1;
//        }else if(this.getStuAge() > stu.getStuAge()){
//            return -1;
//        }

        result = this.getStuAge()-stu.getStuAge();
        if(result == 0){
            result = stu.getStuName().compareTo(this.getStuName());
        }
        if(result == 0){
            result = this.getStuGender().compareTo(stu.getStuGender());
        }
        return result;

//        x.compareto(Stu b);
    }
}
