## 1、变量

概念：变量是一个容器，这个容器可以装载一个数据。

变量三要素：变量的数据类型，变量名，当前值。

变量数据类型：java语言从大类型上分分为两种：基础数据类型和引用数据类型。

基础数据类型：八种：byte，short，char，int，long，float，double，boolean

变量名：标识符：52个字母，0-9十个数字，_和$。这些是合法的标识符字符。注意：标识符不能使用关键字，不能数字开头，不能有空格。变量应该是驼峰命名法，见名知意。

当前值：赋值通过=赋值运算符，=右侧的值给=左侧的变量。必须是同类型的常量值赋值给同类型的变量。

变量的使用：

```java
int age = 20;// 声明变量，声明的同时赋值
System.out.println(age);// 使用变量

int age;// 先声明变量
age = 20;// 为变量赋初值
System.out.println(age);// 变量在第一次使用时必须有值
```

## 2、计算机底层保存和运算数据的格式

1、计算机底层使用数字的二进制补码形式进行存储。

2、补码的来源：

2.1正数：三码合一，一个正整数的二进制形式就是它的原码，反码和补码和原码一样。

2.2负数：二进制的形式是原码，反码是原码符号位不动，剩下的位取反。补码是反码+1。

计算机中以补码的形式存储和计算，但是结果要转成原码。

## 3、运算符

运算符的分类：算术运算符，关系运算符，逻辑运算符，三元运算符，位运算符，赋值运算符

算术运算符：+ - * /  % ++ --，算术运算符连接的是算术表达式，算术表达式的结果是数值。

%只有对整数的时候有效。/ 如果是整数那么就是商，如果是浮点数那么结果会出现小数点。

前++和后++的区别：前++是现进行自加，再进行运算，后++是先进行运算后进行自加。

关系运算符：> < >= <= == !=,六个关系运算符平级，关系运算符连接的是关系表达式，关系表达式的结果是boolean。

逻辑运算符：&& || ！ & |  ^ ，逻辑运算符的作用是连接两个关系表达式，&&两端都是true结果才是true，否则是false，||有一端是true结果就是true，除非两端都是false结果才是false。

赋值运算符：=右侧的值给左侧的变量，优先级最低。=右侧常量给变量赋值，=右侧表达式结果给变量赋值，=右侧变量给变量赋值。

+=：i += 100等价于 i=i+100；

三元运算符：？：？左侧的关系表达式返回true则运行：左侧的表示式，返回false则运行：右侧的表达式。

位运算符：& | ^ ~ << >> >>> 特点：只能运算整数，必须是整数的二进制形式的数字运算。

## 4、流程控制

4、1 判断结构

```java
if(条件表达式){// 如果表达式的结果为true则执行if后面大括号的内容，如果为false则跳过if块向下执行
    
}
// if-else只能有一个代码块执行，if-else必须有一个块执行
if(条件表达式){// 表达式为true则执行if块，表达式为false则执行else块。
    
}else{
    
}
```

4、2 分支结构

```java
// 多重if-else
if(条件1){// 首先判断最上面的条件，为true，则执行代码块，然后跳出整个结果。为false则向下判断第二个条件
    
}else if(条件2){// 为true则执行代码块，跳出。为false则向下继续判断
    
}else if(条件3){
    
}
......// else-if的数量没有限定
else{// 所有的if或者else-if的条件都不为true则执行else块，这是一个可选结构
    
}

// switch-case
switch(变量){// 变量的类型可以是byte，short，char，int，从jdk1.5开始可以是枚举，从jdk1.7开始可以是String
    case 常量1:// switch的变量值和case后面的常量值相等时，则执行case后面的代码，直到siwtch末尾
        break;// 跳出整个switch结构，避免贯穿case
    case 常量2:
        break;
    case 常量3:
        break;
    ...... // case的数量没有限定
    defualt:// 没有任何case匹配时执行default
        break;
    
}
```

4、3 循环

```java
while(循环条件){// 先判断，后执行。首先判断循环条件，为true则进入循环体。循环体执行完毕，返回到循环起点，继续判断循环条件。循环条件为false则退出循环
    // 循环操作
    // 循环变量的改变
}

// 循环条件依赖循环操作时，适合使用do-while循环
do{
    // 循环操作
    // 循环变量的改变
}while(循环条件);// do-while循环首先执行一次循环体，然后判断循环条件，先执行，后判断。
```

for循环：循环次数确定，先判断后执行

```java
for(循环变量的定义 ;循环条件 ;循环变量的改变 ){
    // 循环操作
}
```

break和continue关键字：

break关键字的作用是跳出整个循环，break触发则从循环后代码向下继续执行。

continue关键字是结束本次循环开始下一次循环，continue触发则循环返回循环起点再次判断循环条件。

二重循环：一个循环被完整的包裹在另一个循环的循环体中

```java
for(){
    // 外层循环
    for(){
        // 内存循环
    }
}
while(){
    while(){
	}
}
for(){
    while(){
        
    }
}
```

特点：二重循环的内层循环次数是内外层循环次数的乘积，外层循环次数仅是外层的循环数。

## 5、数组

概念：保存多个数据的容器

数组的四个要素：数组类型，数组名，数组元素，访问下标。

数组类型：一个数组只能保存同类型数据，不能保存其他类型数据。

数组名：使用数组名访问数组

数组元素：使用数组参与运算时一定是数组的元素参与运算，一个该数组的元素就形同于一个给数组类型的变量。

访问下表：访问数组元素的方式是数组名[访问下标]，访问下标有合法访问下标和非法访问下标，合法访问下标的区间是0到数组长度-1。

数组的声明：

```java
// 动态声明
int[] one = new int[5];// 声明时确定数组长度，但没有为每一个数组元素赋值，数组元素在不赋值的情况下是保存默认初始值。
one[0] = 100;// 数组名[下标]访问数组元素
// 静态声明
int[] two = {10,20,30};// 必须在一行之内完成，每个数组元素都是初始值，数组的长度靠大括号中的元素数来决定

int[] three;
three = new int[]{40,50,60};// 可以断成两行完成,其他和第一种静态声明一样
```

数组遍历：

```java
int[] one = {10,20,30,40,50,60};

for(int i = 0;i < one.length; i++){
    System.out.println(one[i]);
}
```

数组在内存中的存储方式：数组名是一个引用名，数组名保存的是数组一串连续存储空间的首元素地址。通过new关键字创建的数组空间出现在堆空间中，引用名出现在栈空间中，栈空间的引用指向堆空间中的数组地址。

二维数组：一维数组的元素是另外一个数组，就构成了二维数组。

声明：

```java
// 动态声明
int[][] one = new int[5][3];// 同时给出一维和二维的长度

int[][] two = new int[5][];// 声明时只给出一维的长度，不给二维的长度，此时只有一维数组初始化

two[0] = new int[5];// 声明新数组给一维元素赋值

// 静态声明
int[][] three = {{1,2,3},{4,5,6},{7,8,9}};

int[][] four = new int[][]{{1,2,3},{4,5},{6}};
```

遍历：

```java
int[][] three = {{1,2,3},{4,5,6},{7,8,9}};

// 需要使用二重循环，遍历二维数组
for(int i = 0;i < three.length; i++){// 外层循环遍历一维数组
    for(int j = 0;j < three[i].length;j++){// 内层循环遍历二维数组
        System.out.println(three[i][j]);
	}
}
```

## 6、类和对象

6.1 面向对象编程和面向过程编程：

面向过程的编程思想是处理问题时，考虑的是处理问题的步骤。然后按照步骤编写代码解决问题。

面向对象的编程思想是处理问题时，考虑的是哪个类的哪个方法可以解决这个问题，然后创建对象，调用方法，解决问题。

6.2 类和对象

类：类是模板，类是规范，类是概念，类规定了一类事物必须有的属性和方法。类是对象的类型。

对象：对象是具体的实体，对象需要符合类的规范要求，对象是由类生成的。对象调用属性和方法。

6.3 定义类

```java
public class Student{
    // 类体中包含属性和方法
    public String stuName;
    public int stuAge;
    
    public void sayHello(){
        System.out.println("hello");
    }
}
```

6.4 创建对象调用属性和方法

```java
public class Test{
    public static void main(String[] args){
        Student stu = new Student();// 创建对象
        stu.stuName = "Tom";// 对象名调用属性名
        stu.stuAge = 20;
        
        stu.sayHello();// 对象名调用方法
    }
}
```

6.5 方法

方法的五个常规部分：访问修饰符 返回类型 方法名(参数组){方法体}

访问修饰符：规定方法可以被哪种结构访问，访问修饰符可以修饰类的成员，修饰属性和方法。

public公开访问：可以被任何结构访问

protected修饰：本包及非本包的子类可以访问

default修饰：只有本包的结构可以访问

private私有访问：只能别本类结构访问

返回类型：返回类型可以是任何一种出现在java语言中的类型。返回类型规定了该方法返回的值的类型，规定了返回类型的方法，必须在方法结束前返回一个该类型的值。如果方法无返回值则该位置写void。

方法名：要符合标识符命名规范，不能使用关键字。见名知意。

参数组：参数的类型可以是任何一种出现在java语言中的类型，参数的个数没有数量限制。调用一个带参的方法，必须按照方法要求传参(参数类型要求，参数个数要求，参数顺序要求).

方法体：代码写在方法体中。由一对大括号括中方法体。

6.6 static关键字

static关键字可以修饰类的成员：

static修饰属性，属性被称为静态属性，属性变成了类所有对象共有的属性，被称作类变量。用类名直接调用，也可以使用对象名调用，但是不推荐。

static修饰方法，方法被称为静态方法，静态方法可以由类名直接调用，也可以由对象名调用，但是不推荐。

static关键字修饰的静态成员，只能访问静态成员，普通成员可以访问静态成员，也可以访问普通成员。

6.7 构造方法

特点：构造方法没有返回类型，构造方法与类同名，构造方法只能在创建对象时调用，对象创建后就不能调用了。

```java
public class Student{
    
    private String stuName;
    private int stuAge;
    
    public Student(){// 没有任何一个显示构造方法的java类，默认有一个隐示的无参的构造方法
        // 构造方法
    }
    
    public Student(String stuName,int stuAge){// java类中有任何一个显示的有参的构造方法，默认无参的隐示的构造方法就会消失，需要显示的写出来。
        this.stuName = stuName;
        this.stuAge = stuAge;
	}
    
    public String getStuName(){
        return stuName;
    }
    
    public void setStuName(String stuName){
        this.stuName = stuName;
    }
    
    public int getStuAge(){
        return stuAge;
    }
    
    public void setStuAge(int stuAge){
        this.stuAge = stuAge;
    }
    
}
```

6.8 封装

概念：隐藏具体细节，对外暴露尽量少的信息。

使用JavaBean实现封装：

JavaBean：1、所有的属性都是用private修饰，提供public的get/set方法。2、必须有无参构造方法。3、拥有一个可以打印所有属性信息的方法。

```java
// 标准JavaBean
public class Student{
    
    private String stuName;
    private int stuAge;
    
    public Student(){// 没有任何一个显示构造方法的java类，默认有一个隐示的无参的构造方法
        // 构造方法
    }
    
    public Student(String stuName,int stuAge){// java类中有任何一个显示的有参的构造方法，默认无参的隐示的构造方法就会消失，需要显示的写出来。
        this.stuName = stuName;
        this.stuAge = stuAge;
	}
    
    public String getStuName(){
        return stuName;
    }
    
    public void setStuName(String stuName){
        this.stuName = stuName;
    }
    
    public int getStuAge(){
        return stuAge;
    }
    
    public void setStuAge(int stuAge){
        this.stuAge = stuAge;
    }
    
}
```

6.9 方法重载：

概念：必须在同一个类中，方法名相同，参数组不同(参数类型不同，参数个数不同，参数顺序不同)。构造方法和普通方法都可以重载。方法重载是多个方法。

```java
public class Student{
    
    public void sayHello(){
        
    }
    
    public void sayHello(String s){
        
    }
    
    public void sayHello(int i){
        
    }
}
```

6.10 变长参数组：

从jdk1.5开始，方法可以声明变长参数组

```java
public class Student{
    
    // 一个方法的参数列表只能定义一个变长参数组
    public void showInfo(String... words){
        // 变长参数组再使用时，和数组一样
        for(int i=0;i < words.length; i++){
            System.out.println(words[i]);
        }
    }
    
    // 变长参数组必须在参数列表的最后一项
    public void showInfo(int a,double d,String... words){
        
    }
    
}

public class Test{
    public static void main(String[] args){
        Student stu = new Student();
        stu.showInfo("a","b","c","d");// 变长参数组传参，依次传入多个同类型的参数，数量没有限制。
        stu.showInfo();// 可以在定义变长参数的方法调用时，不传递任何参数。
        stu.showInfo(10,5.5,"a","b","c");// 调用带有普通参数和变长参数的方法时先传递普通参数，在传递变长参数组列表。
    }
}
```

## 7、继承

语法规范：

```java
// 一个类没有显示的使用extends关键字继承自另一个类，那么它默认继承自Object类。
class Father{
    
}

// 子类通过extends关键字继承自父类，子类继承父类后可以继承到父类所有的属性和方法，构造方法不能继承。
// 一个java类只能继承自一个父类，java单继承。
class Son extends Father{
    
}
```

继承状态的属性：

```java
class Father{
    public int a = 1;
    private int b = 1;
    public int c = 1;
    
    public int getB(){
        return b;
    }
    
    public void setB(int b){
        this.b = b;
    }
}

class Son extends Father{
    public int a = 2;
    private int b = 2;
    public int d = 2;
    
    /*
    public int getB(){
        return b;
    }
    
    public void setB(int b){
        this.b = b;
    }
    */
}

class Test{
    public static void main(String[] args){
        Son son = new Son();
        System.out.println(son.a);// 2
        System.out.println(son.getB());//子类有重写：2 子类没重写:1
        System.out.println(son.c);// 1
        System.out.println(son.d);// 2
        
        Father father = new Father();
        System.out.println(father.a);// 1
        System.out.println(father.getB());// 1 调用父类的getB()
        System.out.println(father.c);// 1
    }
}
```

继承状态下的方法：

重写：在父子类中，子类编写一个和父类方法签名一模一样的方法，叫做方法重写。一旦发生方法重写，那么在调用的一定是子类的方法。

```java
class Father{
    public void sayHello(){
        System.out.println("hello");
    }
}

class Son extends Father{
    // 注解可以检测方法重写的语法规范
    @Override
    public void sayHello(){
        System.out.println("son sayhello");
    }
}
```

继承状态下的构造方法：

构造方法不能继承，子类的构造方法必须在第一行调用父类的构造方法，如果没有显示的调用，则默认调用父类无参的构造方法，如果有显示的调用则可以调用父类的任何一个构造方法。

```java
class Father{
  
    
    public Father(String s){
        
    }
}

class Son extends Father{
    public Son(){
        // 默认调用父类无参的构造方法
        super("hello");
	}
    
    public Son(String s){
        super(s);
    }
}
```

final关键字：修饰类，修饰方法，修饰属性，修饰局部变量，修饰参数

修饰类：类不能被继承

修饰方法：方法不能被子类重写

修饰属性：属性变成常量，通常情况下属性写成：public static final String NAME = “TOM”;公开静态常量的属性必须在声明的同时赋值，且这个值不再改变。

修饰局部变量：局部变量变成常量，赋初值后值就不能在改变了。

修饰参数：参数在方法内部只能被使用，不能被修改值。

## 8、多态

概念：任何一个需要父类引用的位置都可以传递一个子类对象。

实现多态的三个关键步骤：

1、继承，父类声明方法，子类重写方法。

2、父类的引用指向子类的对象

3、创建对象时多态，传参多态

代码特点：

```java
class Father{
    public void methodOne(){}// 父类定义方法
}

class Son extends Father{
    public void methodOne(){
        System.out.println("in Son methodOne()");// 子类重写方法
	}
}

class Test{
    public static void main(String[] args){
        Father f = new Son();// 创建对象时多态
        Son son = new Son();
        methodTWo(son);// 传参时多态，实参子类对象
    }
    
    public static void methodTwo(Father f){// 形参父类类型
        f.methodOne();
    }
}
```

方法重写：在父子类中，父类定义方法，子类编写一个和父类方法签名一摸一样的方法，被称作方法重写。

子类重写父类方法时，访问修饰符，返回类型，抛出异常三个部分可以和父类不同：

1、子类重写父类方法时，子类的访问修饰符只能比父类的访问修饰符访问级别更宽，不能更窄。

2、返回类型，父类的方法返回类型是void或者基础数据类型时，子类重写的方法必须和父类的方法的返回类型一致。父类的方法的返回类型如果是引用数据类型，子类重写父类方法时，返回类型可以是父类返回类型的子类型。

3、抛出异常，父类的方法抛出的异常，子类重写时可以抛出父类异常的子异常。



## 9、抽象

abstract关键字：修饰类，修饰方法

修饰类：类不能创建对象

修饰方法：方法没有方法体

抽象的类中可以有抽象的方法也可以用普通的方法，抽象的方法必须在抽象的类中。

## 10、Object

特点：

1、Object是所有java类的总父类，任何一个java类都是Object的子类。

2、Object中的常用方法

equals方法：比较两个对象是否相等。在Object中equals方法仅能比较两个对象是否来自于同一个内存地址。

toString方法：将一个对象变成字符串形式返回。当一个对象被放到println方法中准备输出时，会自动调用该对象的toString方法。

## 11、接口

接口的语法：

```java
public interface A{
    // 接口中所有的属性默认是公开静态常量
    public static final String NAME = "Tom";
    // 接口中所有的方法默认是公开抽象
    public abstract void methodOne();
}
```

接口的特点：

1、接口不允许实例化。

2、接口必须配备实现类。

接口的实现类：

```java
// 使用implements关键字，类B是接口A的实现类
// 一个接口的实现类必须实现接口中所有的抽象方法
public class B implements A{
    public void methodOne(){
        System.out.println("hello world!");
    }
}
// 一个接口可以有多个实现类
public class C implements A{
    public void methodOne(){
        System.out.println("bye bye!");
    }
}

// 一个类可以实现多个接口，一个类实现多个接口必须，实现这些接口中的所有的抽象方法。
public class D implements A,Comparable{
    
}
```

接口可以继承，并且是多继承

```java
interface A{
    public void methodOne();
}

// 接口可以继承接口
interface B extends A{
    // 子接口继承父接口，子接口将继承到父接口中的方法
    
    public void methodTwo();
}

class C implements B{
    public void methodOne(){};
    
    public void methodTwo(){};
}

interface D{
}
// 接口可以多继承
interface E extends A,D{
}
```

## 12、封装类

概念：java语言为每一种基础数据类型都对应的准备了一个引用类型。这个引用类型叫做封装类。

封装类的基本操作：

```java
// 1、创建封装类对象
Integer one = new Integer(10);
Integer two = new Integer("50");

// 2、对象转基础类型
int i = one.intValue();

// 3、基础类型转封装类型
Integer one = new Integer(i);
Integer two = Integer.valueOf(i);

// 4、String类型转封装类型
Integer one = new Integer("50");

// 5、封装类型转String
String s = one.toString();

// 6、基础类型转String
String s = Integer.toString(i);
```

自动装箱和自动拆箱：从jdk1.5开始，基础类型和对应引用类型可以自动转换。如果是引用类型需要进行运算，引用类型必须转成基础类型。

## 13、枚举

概念：枚举用于适应只有固定的几个值的情况，比如一年有四季，一个年有十二个月，一个星期有七天。

实现枚举：jdk1.5之前的枚举

```java
public class Gender{
    // 提供公开静态常量的该类属性
    public static final Gender MAN = new Gender();
    public static final Gender WEMON = new Gender();
    
    // 构造方法私有
    private Gender(){
        
    }
}
```

jdk 1.5之后的枚举

```java
public enum Gender{
    // 必须在类体的第一部分声明该类属性的公开静态常量
    // 除属性名外的其他修饰部分全部省略
    MAN,WEMON;
    
    // enum声明的类体中，所有的构造方法默认是private修饰
}
```

## 14、内部类

概念：一个类完整的被定义在另一个类的类体中，这个类就叫内部类。

分类：成员内部类和局部内部类

成员内部类：1、静态成员内部类，2、普通成员内部类

局部内部类：定义在方法体中的内部类，匿名内部类是局部内部类的一种特殊形式

静态成员内部类：

```java
class Outer{
    
    // 静态成员内部类可以访问外部类的静态成员，不能访问普通成员
    // 静态成员内部类可以定义静态成员，也可以定义普通成员
    public static class Inner{
        
    }
    
    public void methodOne(){
        Inner inner = new Inner();// 在外部类类体内，直接访问内部类的类名，直接创建内部类的对象
	}
    
}

class Test{
    public static void main(String[] args){
        // 在外部类类体外访问内部类需要由外部类类名.内部类类名
        // 静态成员内部类创建对象时，无需先创建外部类对象，直接创建内部类对象
        Outer.Inner inner = new Outer.Inner();
    }
}
```

普通成员内部类：

```java
class Outer{
    // 普通成员内部类
    // 普通成员内部类不能声明静态成员，只能声明普通成员
    // 普通成员内部类可以访问外部类所有的属性和方法
    public class Inner{
        
    }
    
    public void methodOne(){
        Inner inner = new Inner();// 在外部类类体内直接访问内部类类名，直接创建内部类对象
    }
}

class Test{
    public static void main(String[] args){
        // 普通成员内部类需要先创建外部类对象，再由外部类对象创建内部类对象
        Outer.Inner inner = new Outer().new Inner();
    }
}
```

局部内部类：

```Java
class Outer{
    public void methodOne(){
        // 在方法体中定义的内部类被称作局部内部类
        // 局部内部类不能定义静态成员，只能定义普通成员
        // 局部内部类可以访问外部类所有的属性和方法
        class Inner{
            
        }
        
        Inner inner = new Inner();// 局部内部类只能在定义它的方法使用不能超过这个方法直接创建对象。
    }
}
```

匿名内部类实现接口：

```java
interface Fly{
    public void flying();
}

class Test{
    public void methodOne(){
        Fly fly = new Fly(){// 匿名内部类实现接口
            public void flying(){
                System.out.println("飞~~~~~~~~~~~~~~~~~~");
            }
        };
        
        fly.flying();// 调用方法
    }
}
```

## 15、注解

概念：由@开头的一组结构，作用是在程序中标注或者体现某种功能，注解不会影响程序的运行结果

分类：系统提供的三个主要注解

```java
public class Teacher implements Person {
    // 检测方法重写的语法是否符合规范
    @Override
    public void sayHello() {
        System.out.println("早上好，同学们");
    }
    
    // 标注方法已过期注解
    @Deprecated
    public static void methodOne(){
        System.out.println("in static methodOne");
    }
    
    // 抑制警告注解
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // 抑制警告注解,放在变量上的注解只能控制当前变量，其他变量不能控制
        // @SuppressWarnings("unused")
        int one = 100;
        // System.out.println(one);

        int two = 200;
        // List list = new ArrayList();
        // System.out.println(list.size());
        methodOne();
    }
}


```

## 16、异常

概念：运行时的错误，异常不会在编译期报错，但是程序运行后，根据参数或者运行环境，发生的错误被称为异常。

异常流程：java程序会在出现异常的那行代码中止，创建一个该类异常的对象并向上抛出。如果异常对象抛给虚拟机，则虚拟机会立即终止当前进程。如果没有抛给虚拟机，则程序会继续执行。

异常分类：

1、RuntimeException及其子类：未检查异常，这类异常系统不强制必须处理，但是抛出异常对象会走异常处理流程。

2、非RuntimeException及其子类：已检查异常，这类异常系统强制必须处理，否则编译报错。



异常处理：

1、try-catch-finally

try块负责监控可能出现异常的代码区，一旦出现异常则监控抛出对象。

try块必须出现，但不能独立出现。try块可以和catch块一起出现，也可以和finally块一起出现，或者和catch、finally同时出现

```java
// 正确的try-catch-finally组合方式
// try-catch
try{
    
}catch(Exception ex){
    
}
// try-finally
try{
    
}finally{
    
}
// try-catch-finally
try{
    
}catch(Exception ex){
    
}finally{
    
}
```

catch块负责捕获异常：catch块后面有个参数，这个参数规定了该catch块捕获的异常种类，该catch块只会捕获规定的异常。catch块可以只有一个，也可以多重catch。

```java
try{
    
}catch(异常1 ex){
    // catch块自上而下的判断每个catch块捕获的异常种类，一旦匹配异常对象成功，则执行该catch块，执行完毕退出整个结构，其他的catch不会运行
}catch(异常2 ex){
    // 当上一个异常对象没有匹配成功后，则向下判断下一个catch块的捕获
}catch(Exception ex){
    // 如果catch块捕获的异常种类为Exception，那么按照多态的原理，这个catch块可以捕获所有种类的异常
}
```

finally块：无论是否出现异常，finally块都一定执行，甚至有return的情况，finally都会在return之前执行。因此finally块经常被用于编写释放资源的代码。

2、方法throws异常：方法可以在方法签名的抛出异常区规定自己抛出哪类异常或者哪几类异常。

```java
public void methodOne(String s)throws NullPointerException,ClassCastException...{
    // 方法一旦声明抛出异常，则方法内部将不再处理此类异常，这类异常将抛给方法调用点，由调用点处理
}
```



自定义异常：

1、自定义已检查异常，自定义异常类继承自Exception

```java
class StudentAgeException extends Exception{
    // 利用构造方法传递异常信息，如果想利用这种方式传递异常信息，则不能重写getMessage方法
    public StudentAgeException(String info){
        super(info);
    }
    
    // 重写getMessage方法,重写这个方法拥有更高的优先级
    public String getMessage(){
        return "异常提示信息";
    }
}
```

2、自定义未检查异常，自定义异常来继承自RuntimeException

```java
class StudentAgeException extends RuntimeException{
    // 利用构造方法传递异常信息，如果想利用这种方式传递异常信息，则不能重写getMessage方法
    public StudentAgeException(String info){
        super(info);
    }
    
    // 重写getMessage方法,重写这个方法拥有更高的优先级
    public String getMessage(){
        return "异常提示信息";
    }
}
```

## 17、多线程

重要概念：

1、程序、软件、进程、线程：

程序：为了完成某个任务，编写的一些列代码指令的集合。

软件：多个程序的集合。

进程：当一个程序或者一个软件运行起来的时候，就会在操作系统中，形成一个或者多个进程。

线程：进程之下，具体执行一个任务的程序运行，一个进程下至少会有一个线程，更多的时候是一个进程下有多个线程。

2、并行和并发：

并行：多个处理终端，同时处理各自的任务，这个同时相对时间非常短，是真正的多个任务同时处理。

并发：多个任务，在一段时间中，同时处理，这个同时相对时间比较长，可以由单个终端利用排队的方式处理。



在java程序中开启新的子线程：

1、继承Thread类

```java
class MyThreadOne extends Thread{// 自定义异常类继承自Thread类
    
    public void run(){// 重写run方法，将需要新开启的子线程执行的代码写在run方法中
        // 子线程代码
	}
    
}

class Test{
    public static void main(String[] args){
        MyThreadOne mto = new MyThreadOne();
        mto.start();// start方法开启新的子线程，调用run方法
    }
}
```

2、实现Runnable接口

```java
class MyThreadTwo implements Runnable{// 自定义线程类实现Runnable接口，保留继承的机会
    public void run(){// 实现接口中的run方法，将子线程运行的代码写在run方法中
        // 子线程代码
    }
}

class Test{
     public static void main(String[] args){
        MyThreadTwo mtt = new MyThreadTwo();// 实现接口的方式，类中只有run方法，需要new Thread对象才能调用start方法，将自定义线程类对象作为参数传递给Thread对象。
        Thread thread = new Thread(mtt);// new Thread对象时，放入的参数对象的run方法被start调用
        thread.start();
    }
}
```



Thread类中的常用方法：

```java
run()// 开启新线程需要完成代码写在run方法中
start()// 开启新的子线程，并且调用run方法
sleep(int time)// 使当前线程休眠，参数是休眠的毫秒数，休眠时间到期，线程唤醒
getName()// 获取当前线程名称
setName(String name)// 设置当前线程名称
setPriority(int i)// 设置当前线程优先级，优先级从低到高分别是1-10，默认优先级是5
getPriority()// 获取当前线程优先级
isAlive()// 检查当前线程是否开启
join()// 让其他线程插队，无参的形式下，需要插队的线程完成进行完，当前线程继续。有参数的形式，等待参数的毫秒数到期则，当前线程继续
yield()// 让当前线程退出cpu，使cpu重新选择。
```



线程安全：

产生线程不安全的原因：首先多线程同时运行，其次多个线程访问同一个共享资源。

解决线程安全问题的方式：

1、同步代码块

```java
public void run(){
    // 被同步代码块扩中的代码，必须有锁对象才能进入同步代码块执行，没有锁对象的线程不能执行。
    // 锁对象必须保证内存中唯一，如果锁对象不唯一，则无法完成同步代码块的功能。
    synchronized(锁对象){// 同步代码块
        // 同步代码块代码
    }
}
```

2、同步方法：同步方法中的所有代码在同一个同步代码块中。

```java
class MyThreadOne{
    
    // 由synchronized关键字修饰的方法被称作同步方法，普通同步方法的锁对象是this
    public synchronized void methodOne(){
        
    }
    
    // 静态同步方法的锁对象是当前类的类类对象:MyThreadOne.class
    public static synchronized void methodTwo(){
        
	}
}
```

## 18、AIP中的常用类

Math：数学类，所有的属性和方法都是静态的，不需要创建对象。

Random：随机类，拥有一系列产生随机值的方法。

日期类：

jdk1.8之前的日期类：

```java
// jdk1.8之前处理日期的方式
        Date date = new Date();// 获取当前系统时间
        System.out.println(date.getTime());// 返回计算机表示时间的真是状态
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = sdf.format(date);
        System.out.println(strDate);
        Calendar cal = Calendar.getInstance();// 获取当前系统时间
        int year = cal.get(Calendar.YEAR);// 指定获取时间的某一部分
        System.out.println(year);
        cal.add(Calendar.HOUR_OF_DAY,1000);// 在指定的时间位置，位移第二个参数给出的位移量，第二个参数为整数代表时间向后位移，负数代表时间向前位移。
        Date date1 = cal.getTime();
        String strDate1 = sdf.format(date1);
        System.out.println(strDate1);
```

jdk1.8之后的日期类：

```java
 // jdk1.8之后处理日期的方式
        LocalDate localDate = LocalDate.now();// 只有年月日没有时分秒
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getMinute());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
```

## 19、String类

19.1 创建String对象的两种方式

```java
String s = "hello";// 这种方式将首先检索串池，如果串池没有对象字符串，则创建字符串，然后将串池中的地址直接赋值给引用。如果串池中已经有对象字符串，则不创建新的字符串，将原有字符串内存地址赋值给引用。
String s = new String("hello");// 直接在堆空间中创建String对象，然后让String对象的属性指向串池中的字符串对象。
```

19.2 两个字符串对象的比较相等

```java
// 字符串对象不能用==比较是否相等，==只能比较两个对象的内存地址。
// 需要使用equals方法来比较两个字符串是否相等
word.equals("hello");// 调用方法的字符串和参数字符串逐个比较字符，考虑大小写
word.equalsIgnoreCase("hello");// 调用方法的字符串和参数字符串逐个比较字符，不考虑大小写
```

19.3 Sting的常用方法

```java
 		 String word = new String("hello");

        System.out.println(word.length());// 返回当前String的字符数，包含两端及中间的空格
        System.out.println(word.concat(" world"));// 拼接两个字符串，拼接后产生第三个字符串
        System.out.println(word.equals("hello"));// 考虑大小写的比较两个字符串是否相等。
        System.out.println(word.equalsIgnoreCase("HELLO"));// 忽略大小写的比较两个字符串值是否相等
        System.out.println(word.toUpperCase());// 将原串全部字符转成大写字母
        System.out.println(word.toLowerCase());// 将原串全部转字符成小子字母
        byte[] bs = word.getBytes();// 将字符串拆分成字节数组
        try {
            byte[] bs1 = word.getBytes("utf-8");// 将原串按照某个特定的编码规则拆分成字节数组
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        char[] cs = word.toCharArray();// 将原串拆分成字符数组
        System.out.println(word.indexOf("ell"));// 在原串中搜索目标字符串第一次出现的索引
        System.out.println(word.indexOf("ell", 3));// 从第二个参数索引位置开始，在原串中搜索第一个参数的第一次出现的位置。
        word.lastIndexOf("ell");// 在原串中搜索参数字符串最后一次出现的索引位置
        word.lastIndexOf("ell",3);// 从第二个参数索引位置开始在原串中搜索第一个参数最后一次出现的索引位置
        System.out.println(word.charAt(3));// 在原串中，返回参数索引位置的字符
        System.out.println(word.substring(2));// 从参数索引位置开始，截取到字符串末尾
        System.out.println(word.substring(2, 4));// 从第一个参数索引位置开始，截取到第二个参数索引位置的前一位。
        System.out.println(word.replace('l', 'w'));// 使用新的字符替换所有老的字符
        word.replaceAll("w","l");// 使用支持正则表达式的字符串，新串替换所有的老串
        word.replaceFirst("w","l");// 使用支持正则表达式的字符串，用新串替换第一个出现的老串
        String[] words = word.split(" ");// 使用支持正则表达式的字符串做参数，将原串分割成一个字符串数组     
        word.trim();// 去掉两端的空格
```

## 20、集合框架

概念：保存多个元素的容器，集合是变长的，保存的元素是Object类型。

20.1 : 

Collection接口：没有独有的实现类

常用方法：

```java
		Collection coll = new ArrayList();
        Collection collOne = new ArrayList();

        coll.size();// 返回当前集合中的元素数
        coll.add("Tom");// 将一个元素添加进集合
        coll.addAll(collOne);// 将一个集合中所有的元素添加进集合
        coll.contains("Tom");// 在集合中搜索是否存在参数元素，存在则返回true，否则返回false
        coll.containsAll(collOne);// 在集合中搜索是否存在参数集合中的所有元素，只要有一个不存在则返回false，必须全存在返回true
        coll.remove("Tom");// 将参数元素从集合中移除
        coll.removeAll(collOne);// 将参数集合中的所有元素从集合中移除
        coll.iterator();// 返回迭代当前集合的迭代器
        coll.isEmpty();// 判断当前集合是否为空
        coll.clear();// 清空集合中所有元素
```

20.2：

List接口：允许元素重复，有序(新增顺序和遍历顺序一致)

常用方法：

```java
		// List接口有所有Collection接口中的方法,List接口有下标，List接口有根据下标的独特方法
		// list两个参数的添加方法，第一个参数是元素添加的索引位置，第二个参数是元素
        // 第一个参数的索引位置不能大于当前list的size()
        // 在执行添加后，size()会加1，插入位置原元素及以后元素，向后移动一位
        list.add(1,"Tom");
        // 将第二个参数集合，在指定的第一个参数的索引位置开始，全部添加进集合
        // 原索引位置的元素及后续元素要在添加集合的最后一个元素的后面向后移动
        list.addAll(1,listOne);
        // 利用索引，获取单个元素
        Object obj = list.get(0);
        // remove使用索引作为参数，将索引位置的元素从集合中移除
        // 这个方法用于有比以元素为参数移除的方法更高的优先级
        list.remove(1);
        // 使用第二个参数元素，替换掉集合第一个参数索引位置的原元素，方法执行后，size不会改变
        list.set(1,"Jerry");
```

20.3 List接口的重要实现类：

ArrayList：底层使用可变程度数组实现，遍历查询的效率高，频繁增删的效率低。从jdk1.8开始，创建ArrayList对象时不会初始化有长度的数组对象。在第一次执行add方法时，初始化数组长度为10。在集合元素数超过数组容量时扩容，按照原来数组长度的1.5倍扩容

LinkedList：底层使用双向链表实现，遍历的效率低，频繁增删的效率高。有用一套对首尾元素单独进行存取删除的方法

```java
// List list = new LinkedList();// 这种声明集合的方式无法使用LinkedList独有的对首尾元素操作的方法
LinkedList list = new LinkedList();

list.addFirst("Tom");
list.addLast("Jerr");
list.removeFirst();
list.removeLast();
Object obj = list.getFirst();
Object obj = list.getLast();
```

20.4 Set接口

特点：无序(新增顺序与遍历顺序不一致)，不允许元素重复(去重)

独有方法：无(同Collection)

20.5 Set接口的重要实现类：

HashSet：

特点：HashSet使用hashCode和equals方法去重。首先调用hashCode使用hash码值计算当前元素在数组中的索引，如果该索引处无元素，则将新元素存储到该位置。如果索引处有元素则调用equals方法比较新元素和老元素，equals方法返回true代表两个元素相同，不执行添加动作。如果返回false则代表两个元素不相同，将新元素链接到老元素的next属性上。



TreeSet: TreeSet使用红黑树保存数据，存储在TreeSet中的元素，需要在放入集合时进行排序，需要元素可以进行大小比较，如果元素本身可以进行大小比较，则称为自然排序。如果元素本身不能排序，则需要创建TreeSet时给出一个比较器对象。这个比较器对象可以对放入的元素进行大小比较。TreeSet中的元素可以进行排序，升序排列。TreeSet的去重是在排序的同时完成的。

自然排序：

```java
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

    @Override
    public int compareTo(Object o) {
        int result = 0;
        Student stu = (Student)o;
        result = this.getStuName().compareTo(stu.getStuName());
        if(result == 0){
            result = this.getStuAge() - stu.getStuAge();
        }
        if(result == 0){
            result = this.getStuGender().compareTo(stu.getStuGender());
        }
        return result;
    }
}

public class TestOne {
    public static void main(String[] args) {
        // 自然排序,需要实体类本身可以进行排序，实现Comparable接口
        Set set = new TreeSet();

        Student stu = new Student("Tom",20,"男");
        Student stu1 = new Student("Jerry",21,"男");
        Student stu2 = new Student("Mary",22,"女");
        Student stu3 = new Student("Jack",23,"男");

        set.add(stu);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);

        for (Object o : set) {
            System.out.println(o);
        }
    }
}
```

定制排序：

```java
public class TestTwo {
    public static void main(String[] args) {
        // 定制排序，实体类本身不需要排序，由创建TreeSet时传入比较器对象进行排序
        Set set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int result = 0;
                Student stu1 = (Student)o1;
                Student stu2 = (Student)o2;

                result = stu1.getStuName().compareTo(stu2.getStuName());
                if(result == 0){
                    result = stu1.getStuAge() - stu2.getStuAge();
                }
                if(result == 0){
                    result = stu2.getStuGender().compareTo(stu2.getStuGender());
                }

                return result;
            }
        });

        Student stu = new Student("Tom",20,"男");
        Student stu1 = new Student("Jerry",21,"男");
        Student stu2 = new Student("Mary",22,"女");
        Student stu3 = new Student("Jack",23,"男");

        set.add(stu);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);

        for (Object o : set) {
            System.out.println(o);
        }
    }
}
```

20.6 Map接口

特点：键值对集合

常用方法：

```java
		Map map = new HashMap();

        map.put("班长","美国");// put方法用于将键值对元素存入到集合中，两个参数，前键后值
        map.put("学委","中国");
        map.put("体委","俄罗斯");
        map.put("文委","意大利");

        System.out.println(map.get("文委"));// get方法用于将元素从集合中取出，参数是键，返回是值。

        map.remove("体委");// 使用键作为参数移除整个键值对

        System.out.println(map.containsKey("学委"));// 在集合中搜索参数键，如果存在则返回true，不存在则返回false

        map.isEmpty();// 返回集合是否为空

        map.clear();// 清空集合

        map.size();// 返回当前集合的元素数

        Set keys = map.keySet();// 返回map集合的键集

        Collection values = map.values();// 返回map集合中的值集

        Set entrySet = map.entrySet();// 返回map集合中的键值对集
```

20.7 重要实现类：

HashMap: HashMap底层使用链表数组保存数据，在构造方法创建HashMap对象时，为加载因子赋值0.75，在第一次调用put方法存放元素时初始化数组长度为16，在当前集合中键值对数量超过加载因子乘以当前数组长度时，扩容，按照原长度两倍扩容，扩容后所有元素重新分散。当存放键值对时，使用键的hashCode计算该键值对在数组中索引，如果该索引处无元素，则直接存储。如果有元素则将新元素链接到老元素的next属性上，当一个链表的元素数达到8个时，并且此时数组长度超过64，则链表变红黑树，当前数组长度不足64位时，数组扩容。

HashTable: 存储数据的方式和HashMap一致，线程安全。

LinkedHashMap：存储数据的方式和HashMap一致，同时维护一个键的链表，保存键的新增结构，此实现类可以保证存入的键值对新增顺序和存储顺序一致。

TreeMap：使用红黑树的方式存储键值对。

## 21、泛型

21.1泛型在集合中的引用：

```java
// 泛型本身没有多态，泛型必须要求左右两端类型一致
List<String> list = new ArrayList<>();// 推荐使用
List<String> list = new ArrayList();// 不推荐使用
List<String> list = new ArrayList<String>();// 标准形式

list.add(String);// 泛型的添加元素方法，必须是和泛型类型一致，不能将其他类型添加进泛型的集合
String s = list.get(0);// 泛型的集合获取元素的方法，直接返回泛型规定的元素类型，不需要强转

Set<String> set = new HashSet<>();
set.add(String);

Map<String,String> map = new HashMap<>();
map.put(String,String);
String s = map.get(String);
```

21.2 泛型在类声明中的引用

```java
public class<T> Person{
    
    public T data;// 使用泛型声明类的属性
    
    
    public T methodOne(){// 使用泛型声明方法的返回类型
        return "ok";
    }
    
    public void methodTwo(T t){// 使用泛型声明方法的参数
        
    }
}

// 确定泛型具体类型的时机，泛型的具体类型如果不确定，则默认使用Object
public class TestOne{
    public static void main(String[] args){
        Person<String> person = new Person();// 在创建对象时指定泛型的具体类型
        // 泛型的具体类型一旦指定，那么在该类中的所有泛型都直接变成指定的类型
        person.methodTwo("hello");
        String s = person.methodOne();
        person.data = "nihao";
    }
}

// 在继承状态下确定泛型的具体时机
public class Teacher extends Person<String>{// 在子类继承父类时确定泛型的具体类型，此时子类没有泛型子类继承到的父类的泛型变成指定类型
    
}

public class Teacher<T> extends Person<T>{// 在子类继承父类时子类继承父类的泛型，子类变成泛型类，此时需要在创建子类对象时指定泛型的具体类型
    
}

public class Teacher extends Person{// 子类继承泛型父类时，没有指定泛型的具体类型，子类也没有泛型，此时从父类继承到的泛型类型默认使用Object
    
}
```

21.3 泛型在接口中的应用

```java
public interface Person<T>{
    public T methodOne();// 使用泛型作为方法的返回类型
    public void methodTwo(T t);// 使用泛型作为方法的参数类型
}

// 确定泛型的具体时机
public class Teacher implements Person<String>{// 在实现类实现接口是指定具体泛型类型，此时类不是泛型的，接口中的泛型类型直接指定成为具体类型
    
}

public class Teacher<T> implements Person<T>{// 实现类实现接口是继承接口的泛型，此时实现类也是泛型的，确定泛型的具体时机是创建实现类对象时
    
}

// 在接口继承接口时确定泛型的具体类型
public interface Chinese extends Person<String>{// 子接口继承父接口时确定泛型的具体类型，测试子接口不是泛型的
    
}

public interface Chinese<T> extends Person<T>{// 子接口继承父接口时继承父接口的泛型，测试子接口也是泛型的，需要子接口的实现类实现子接口时确定泛型的具体类型
    
}
```

21.4 泛型的通配和上限下限

```java
public class TestOne{
    public void methodOne(Collection<?> col){// ？是通配泛型，这个写法，可以是任何一种泛型集合都可以作为参数传入
        
    }
    
    public void methodOne(Collection<? extends Animal> col){// ？是通配泛型，这个写法，必须是Animal及其子类泛型可以传入，相当于规定了泛型的上限
        
    }
    
     public void methodOne(Collection<? super Animal> col){// ？是通配泛型，这个写法，必须是Animal及其父类泛型可以传入，相当于规定了泛型的下限
        
    }
}
```

