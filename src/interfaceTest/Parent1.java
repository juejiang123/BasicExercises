package interfaceTest;
/*
换成了interface之后，编译的时候还是.java->.class
接口中包含的内容：
Java7

1。常量--接口也可以定义成员变量，但必须是使用public static final三个关键字修饰
2。抽象方法
Java8增加

3。默认方法---用于接口升级,会被实现类继承下去,也可以被实现类覆盖重写,default变量只用于接口
4。静态方法---接口名称调用静态方法，不用对象调静态方法
Java9增加

5。私有方法---不带static时，解决普通默认方法间重复代码问题，带上的话，解决静态方法的重复代码
注意：
1。接口当中的抽象方法，修饰符必须是两个固定的关键字，public abstract
2。这2个关键字修饰符，可以选择性省略；
3。方法三要素可以随意定义
4。接口中成员变量是常量，命名只能是大写字母加下划线分隔
5。接口不能有静态代码块或者构造方法
6。一个类的直接父类是唯一的，但是一个类可以同时实现多个接口
7。实现类未完成对所有的接口抽象方法的重写，则实现类是抽象类
8。实现类实现的接口中，有重复的抽象方法，则覆盖重写一个即可
9。实现类实现的接口中，有重复的默认方法，则一定要对冲突的覆盖重写
10。实现类的直接父类和接口的默认方法冲突，优先父类的方法
11。类与类间是单继承的，接口与接口是多实现的，接口也是多继承的



 */
public interface Parent1 {
    public static final int num=12;

    public abstract void method();

    public default void method1(){
        System.out.println("这是新加的默认方法");
    }


}
