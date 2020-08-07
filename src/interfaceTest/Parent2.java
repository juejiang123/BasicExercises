package interfaceTest;

public interface Parent2 {

    public abstract void method();

    public default void  method1(){
        System.out.println("重复的默认方法");
    }

    public abstract void method2();

    public default void  method3(){
        System.out.println("2的默认方法");
    }
}
