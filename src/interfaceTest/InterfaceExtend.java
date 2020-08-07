package interfaceTest;

public interface InterfaceExtend extends Parent2,Parent1 {

    public abstract void method4();

    @Override
    default void method1(){
        System.out.println("默认方法冲突后覆盖重写");
    }


}
