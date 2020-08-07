package reflexTest;
/*
获取类对象的方式：
1.Class.forName("全类名");
2.类名.class：通过类名的属性class获取，多用于参数的传递
3.对象.getClass():方法在object类中定义着。
 */
import java.lang.reflect.Field;

public class Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls = Class.forName("reflexTest.Person");
        Field[] fields = cls.getFields();
        String s = fields.toString();
        System.out.println(s);
        Class<Person> personClass = Person.class;
        System.out.println(personClass);
        Person p = new Person();
        Class<? extends Person> aClass = p.getClass();
        System.out.println(aClass);


    }
}
