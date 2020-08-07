package StreamTest.SerializableTest;

import java.io.Serializable;
/*
1.类必须实现serializable
2.必须存在类对应的class文件
3.静态不能被序列化，序列化的都是对象
4.transient瞬态关键字，修饰的变量不能被序列化
5.private static final long serialVersionUID = 1L;自定义并统一序列化对象的的版本
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
//    transient int age;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
