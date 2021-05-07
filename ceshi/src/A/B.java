package A;

public class B {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        String c=new String("C");
        String d=new String("D");
//        change(c,d);
        operate(a, b);

        System.out.println(a + "," + b);// AB , B
    }

    public static void operate(StringBuffer x, StringBuffer y) {
        x.append(y);// 等价于a拼接b x = AB
        y = x;// 一旦修改形参的地址值，那么就和实参无关了，即让形参重新指向新的对象了

    }
//    public static void change(String x, String y) {
//        x.append(y);// 等价于a拼接b x = AB
//        y = x;// 一旦修改形参的地址值，那么就和实参无关了，即让形参重新指向新的对象了
//
//    }
}
