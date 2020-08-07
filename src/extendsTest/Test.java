package extendsTest;
/*
重名变量和方法处理：
看创建的对象是子类还是父类，子类对象的话优先找子类，没有则向上查找
方法重写：
继承关系里，方法名称，参数相同，可以覆盖重写
子类方法的返回值必须小于等于父类的范围
object是最高父类
子类方法的权限必须大于等于父类方法的权限修饰符
public>protected>default>private
继承中构造方法访问特点：
子类构造方法中有一个默认隐含的"super()"调用，所以先调用父类构造方法，
子类构造可以通过super调用父类重载构造方法
子类构造方法必须调用父类构造方法，不写则赠送super()，写了会指定调用

super关键字的三种用法：
1。子类的成员方法中，访问父类成员变量
2。子类的成员方法中，访问父类成员方法
3。子类构造方法中，访问父类构造方法

this关键字的三种方法：
1。本类成员方法中，访问本类的成员变量
2。本类成员方法中，访问本类的另一个成员方法
3。本类的构造方法中，访问本类的另一个构造方法,this()调用也必须是构造方法的第一个语句，唯一一个，
super和this两种构造调用，不能同时使用

Java继承的三个特点
1。一个类的直接父类只有一个
2。可以多级继承
3。一个父类可以有很多子类

多态：
格式举例：Fu fu =new Zi(5);
编译看左，执行看右
成员变量优先看等号左边，成员方法变量优先等号右边
向上转型安全，向下转型需要校验，用instanceof关键字
 */
public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi(8);
        System.out.println(zi.num);
        System.out.println(zi.numFu);
        zi.methodFu();
        zi.method();
        System.out.println("+===============");
        Fu fu =new Zi(5);
        fu.methodFu();
        System.out.println(fu.num);
        System.out.println("==============");
        //多态，向上转型
        Fu fu1 = new Zi1();
        fu1.methodFu();
        System.out.println("============");
        if(fu instanceof Zi){
            //向下转型
            Zi zi1 = (Zi)fu;
            zi1.methodZi();
            System.out.println(zi1.num);
        }else if(fu instanceof Zi1){
            Zi1 zi11=(Zi1)fu;
            System.out.println(zi11.num);
        }

    }
}
