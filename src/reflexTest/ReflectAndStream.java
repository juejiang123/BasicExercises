package reflexTest;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectAndStream {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        InputStream inputStream = ReflectAndStream.class.getClassLoader().getResourceAsStream("config.properties");
        prop.load(inputStream);
        String className = prop.getProperty("ClassName");
        String methodName = prop.getProperty("MethodName");
        Class<?> cls = Class.forName(className);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);

    }
}
