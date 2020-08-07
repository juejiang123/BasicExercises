import java.math.BigDecimal;

/**
 * 题目：一个数如果恰好等于他的因子之和，这个数就称为完数。例如6=1+2+3，编程找出1000以内的所有完数
 * 分析：
 * 定义一个方法，判断是否是完数并返回；
 *
 * 主函数里遍历1000内的所有符合的数并输出。
 */
public class Test_43_09 {
    public static void main(String[] args) {
        for(int j=1;j<=1000;j++){
            if(isPerfectNum(j)){
                System.out.println(j);
            }
        }
    }
    public static boolean isPerfectNum(int n){
        int result = 0;
        if(n==1){
            return true;
        }
//       x BigDecimal bd = new BigDecimal("0");
        for(int i= 1;i<n;i++){
            if(n%i==0){
                result +=i;
            }

        }

        if(n==result){
            return true;
        }

        return false;
    }
}
