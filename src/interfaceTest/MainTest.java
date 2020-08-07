package interfaceTest;

public class MainTest {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
        zi.method1();
        zi.method2();
        zi.method3();
        System.out.println("===============");
        InterfaceExtendImpl impl= new InterfaceExtendImpl();
        impl.method();
        impl.method1();
        impl.method2();
        impl.method3();
        impl.method4();
    }
}
