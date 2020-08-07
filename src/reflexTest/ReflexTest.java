package reflexTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflexTest {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        ClassLoader classLoader = personClass.getClassLoader();
        System.out.println(classLoader);
        Constructor<Person> constructor1 = personClass.getConstructor(String.class,int.class,String.class);
        Person person = constructor1.newInstance("xiaoming", 12, "male");
        System.out.println(person);
        Constructor<Person> constructor = personClass.getConstructor();
        Person person1 = constructor.newInstance();
        person1.name = "hhh";
        person1.age = 19;
        System.out.println(person1);
        Method[] methods = personClass.getMethods();
        System.out.println(methods);
        System.out.println("========");
        Field[] fields = personClass.getFields();
        System.out.println(fields);
        for(Field f : fields){
            Class<?> type = f.getType();
            System.out.println(type);
        }
    }
}
