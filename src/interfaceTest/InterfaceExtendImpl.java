package interfaceTest;

public class InterfaceExtendImpl implements InterfaceExtend {
    @Override
    public void method4() {
        System.out.println("extend类里抽象方法");
    }

    @Override
    public void method() {
        System.out.println("父类接口都有的抽象方法继承");
    }

    @Override
    public void method2() {
        System.out.println("parent2里面的方法");
    }
}
