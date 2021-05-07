package A;

public class A {
    public static void main(String[] args) {
        String str = new String("world");
        String str1= "xyz";
        String d="abc";
        String e="def";
        int a= 10;
        char[] ch = new char[]{'h','e','l','l','o'};
        change(str,str1,a,ch);
        System.out.println(d + e);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(a);
        System.out.println(String.valueOf(ch));
    }
    public static void change(String str, String str1,int a,char[] arr){
        a=100;
        str1= "change1";
        str = "change";
        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
        arr[3] = 'd';
        arr[4] = 'e';

    }
}
