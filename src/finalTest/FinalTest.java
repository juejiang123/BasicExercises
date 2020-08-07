package finalTest;

/*
final关键字：
4种常用方法：
1。可以用来修饰一个类
2。可以用来修饰一个方法
3。可以用来修饰一个局部变量
4。可以用来修饰一个成员变量

final类不能有子类
final修饰成员变量时，之前默认值就没有了，需要手动赋值
final修饰局部变量时，只能赋值一次，之后不可修改
 */
public final class FinalTest {
    public static final int num1 = 100;
    public static String name;
    public static void main(String[] args) {
        final int num;
        num=200;
        System.out.println(num);
        System.out.println(num1);
        System.out.println(name);
    }
}
