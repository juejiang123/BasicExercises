import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222（此时共用5个数相加），
 * 几个数相加由键盘控制。输出结果的形式如：2+22+222=246。
 * 分析：
 * 1。键盘输入一个a的值，string类型，输入相加数的个数值；
 * 2。for循环，相加个数为几次，循环几次，a的字符串加几次，然后强转成int类型做加法
 */
public class Test_43_08 {
    public static void main(String[] args) {
        System.out.println("请输入a(小于10)的值：");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a>10){
            System.out.println("请重新输入a：");
            a = scan.nextInt();
        }
        System.out.println("请输入相加次数：");
        int num = scan.nextInt();
        sum(a,num);


    }
//    public static void sum(int a,int num){
//        String numStr = "";
//        String result = "";
////        ArrayList<String> arr = new ArrayList<>();
//        for(int i=1;i<=num;i++){
//            numStr = numStr +a;
//            if(i==1){
//                result = result+numStr;
//            }else {
//                result=result+"+"+numStr;
//            }
////            arr.add(result);
//        }
//        System.out.println(result);
////        System.out.println(arr.get(arr.size()-1));
//
//    }
    public static void sum(int a,int num){
        String numStr = "";
        String result = "";
        BigDecimal bigDecimal = new BigDecimal("0");
        for(int i=0;i<num;i++){
            numStr= numStr+a;
            if(i==0){
                result = result+numStr;
            }else {
                result = result+"+"+numStr;
            }
            bigDecimal = bigDecimal.add(new BigDecimal(numStr));
        }
        result = result + "="+bigDecimal.toString();
        System.out.println("结果："+result);
    }
}
