package zhujie2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 * 当主方法执行后，会自动执行被检测的所有方法（加了注解的方法）
 */

public class TestCheck {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        //1.创建计算器对象
        Calculator calculator = new Calculator();
        //2。获取字节码文件对象
        Class<? extends Calculator> aClass = calculator.getClass();
        Field[] fields = aClass.getFields();

        for (Field field : fields) {
            //获取所有public修饰的成员变量
            System.out.println(field.getName());
            System.out.println(field);

        }
        System.out.println("-------------------");
        Field name = aClass.getField("age");
        System.out.println(name);
        System.out.println("-------------------");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        //3。获取所有方法
        Method[] methods = aClass.getMethods();
        //4。判断方法上是否有check注解
//        for (Method method : methods) {
//            if(method.isAnnotationPresent(check.class)){
//                //5。有，执行
//                try {
//                    method.invoke(calculator);
//                    //6。捕获对象
//                }catch (Exception e){
//                    e.printStackTrace();
//                }

//            }
//        }



    }
}
