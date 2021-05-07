package com.atguigu.test1;

public class Student extends Person{
    public String stuName;
    private int stuAge;
    private String stuGender;

    public static String school;

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

    private void study(){
        System.out.println("in method study()~~~~~~~~~~~~");
    }

    private void study(int one){
        System.out.println("in method study(int)~~~~~~~~~~~~");
    }

    private void study(int one,String s){
        System.out.println("in method study(int,String)~~~~~~~~~~~~");
        System.out.println("one="+one+",s="+s);
    }

    private void study(String word,String hello){
        System.out.println("in method study(String,String)~~~~~~~~~~~~");
    }

    public static void sayHello(String one,int two,boolean three){
        System.out.println("in static method sayHello()~~~~~~~~~~~~~~~~~~~~~~~~");
        if(three){
            System.out.println(one);
        }else{
            System.out.println(two);
        }
    }

}
