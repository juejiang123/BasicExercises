package InnerClass;
/*
如果一个事物的内部包含另一个事物，那么这就是一个类内部包含另一个类
例如：身体和心脏，汽车和发动机
分类：
1。成员内部类
2。局部内部类（含匿名内部类）
成员内部类定义格式：
修饰符 class 外部类名称{
    修饰符 class 内部类名称{

    }
}
注意：内用外，随意访问；外用内，需要内部类对象
如何使用成员内部类？
外部类的方法间接调用，main只是调用外部类的方法
new 外部类对象().new 内部类名称 --直接调用

局部内部类：
只有当前所属的方法才能使用它
修饰符 class 外部类名称{}
   修饰符 返回值类型 外部类方法名称（参数列表）{
    class 局部内部类名称{
    }
   }
小结：定义一个类时，权限修饰符规则：
1。外部类：public/default
2。成员内部类：public/protected/default/private
3。局部内部类：什么都不能写

匿名内部类：
接口实现类或者子类只需要使用唯一的一次
可以省略类定义，直接用匿名内部类
接口名称  对象名 = new 接口名称（）{
   //覆盖重写所有抽象方法
}

 */
public class InnerClass {

    public class Inner{
        int num =10;
        public void method(){
            int num = 40;
            System.out.println("彭彭平");
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(InnerClass.this.num);
        }
    }
    private String name;
    int num=20;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void method(){
        int num =30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(InnerClass.this.num);
        new Inner().method();
    }
/*
如果希望访问所在方法的局部变量，那么这局部变量必须时有效final的
 */
    public void method1(){

        int num=70;
//        num=80;//内部类访问所在方法的局部变量，final可以省略，但是变量不能变
        class Inner1 {
//            int num;

            public void method(){
                System.out.println(num);
            }
        }
        Inner1 inner1 = new Inner1();
        inner1.method();
    }


}
