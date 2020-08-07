package abstractTest;

/*
抽象方法：加上abstract关键字，去掉大括号，直接分号结束。
抽象类：抽象方法所在的类，必须是抽象类才行。
注意：
1。不能直接创建抽象类对象。
2。必须用子类继承抽象父类。
3。子类必须覆盖重写抽象父类当中所有的抽象方法。
4。创建子类对象进行使用
5。抽象类可以有构造方法
6。一个抽象类不一定有抽象方法，只要保证抽象方法在抽象类中就行
7。抽象类的子类，必须重写抽象父类的所有抽象方法，否则编译报错
 */
public abstract class AbstractTest {

    //抽象方法，代表吃东西，具体吃什么{}里面定义
    public abstract void eat();
//    public default void run(){
//        System.out.println();
//    }
    public static void run(){
        System.out.println();
    }
    void test(){}

    public void normalMethod(){

    }
}
