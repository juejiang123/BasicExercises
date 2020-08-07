package interfaceTest;

public class Zi extends Fu implements Parent1,Parent2 {
    @Override
    public void method() {
        System.out.println("hahahha");
    }

    @Override
    public void method2() {
        System.out.println("llllllll");
    }

    @Override
    public void method1(){
        System.out.println("默认方法冲突，覆盖重写");
    }
}
