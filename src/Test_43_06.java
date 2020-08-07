import java.util.ArrayList;
import java.util.Scanner;

/**
 * 题目：输入两个正整数m和n,求其最大公约数和最小公倍数
 * 分析：
 * 1。输入两个正整数，Scanner获取输入值；
 * 2。求最大公约数是较大的数能被整除的，同时也要满足较小的数
 * 3。求最小公倍数是m*n/(最大公约数)
 */
public class Test_43_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int m = scan.nextInt();
        System.out.println("请再输入一个正整数：");
        int n = scan.nextInt();
        int maxComdivisor = maxComdivisor(m, n);
        System.out.println("最大公约数是"+maxComdivisor);
        int minComMultiple = m*n/maxComdivisor(m,n);
        System.out.println("最小公倍数是"+minComMultiple);

    }
    public static int maxComdivisor(int num1,int num2){
        int result = 1;
        int num=num1>num2?num1: num2;
        for(int i=2;i<=num;i++){
            if(num1%i==0 && num2%i==0){
                result =result*i;
                num1 = num1/i;
                num2 = num2/i;
            }
        }
        return result;
    }

}
