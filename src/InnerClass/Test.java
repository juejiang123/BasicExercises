package InnerClass;
/*
1。匿名内部类在创建对象时，只能使用唯一一次，如果需要创建多次对象，则需要定义子类或者实现类
2。匿名对象在调用方法的时候，只能调用一次，需要使用对象，则需要起个名字
3。匿名内部类省略了实现类/子类名称，但是匿名对象时省略了对象名称，匿名内部类和匿名对象不一样
 */
public class Test {
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.method();
        System.out.println("==========");
        innerClass.method1();
        System.out.println("==========");
        InnerClass.Inner inner = new InnerClass().new Inner();
        inner.method();

        Fu fu = new Fu(){
            public void method(){
                System.out.println("hello");
            }
        };
        fu.method();

        InterfaceTest ift = new InterfaceTest() {
            @Override
            public void method() {
                System.out.println("987766");
            }
        };
        ift.method();

        new InterfaceTest() {
            @Override
            public void method() {
                System.out.println("987766");
            }
        }.method();
    }
}
