package zhujie;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Pro(className = "zhujie.Demo1", methodName = "show")
public class Zhujie {
    public static void main(String[] args) throws Exception {
        Class<Zhujie> zhujieClass = Zhujie.class;
        Pro an = zhujieClass.getAnnotation(Pro.class);
        String className = an.className();
        String methodName = an.methodName();

        //获取字节码文件
        Class aClass = Class.forName(className);
        //创建实例对象
        Object o = aClass.newInstance();
        //字节码类获取指定方法名的方法
        Method method1 = aClass.getMethod(methodName);
        //执行该方法
        method1.invoke(o);


    }
}
