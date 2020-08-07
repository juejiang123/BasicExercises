import java.math.BigDecimal;

/**
 * 题目：一个数如果恰好等于他的因子之和，这个数就称为完数。例如6=1+2+3，编程找出1000以内的所有完数
 * 分析：
 * 定义一个方法，判断是否是完数并返回；
 *
 * 主函数里遍历1000内的所有符合的数并输出。
 */
public class Test_43_091 {
    public static void main(String[] args) {
        for(int j=1;j<=1000;j++){
            isPerfectNum(j);
        }

    }
    public static void isPerfectNum(int n){
        String result = "1";
        BigDecimal bigDecimal = new BigDecimal("0");
        for(int i= 2;i<n;i++){
            if(n%i==0){
                result =result+"+"+i;
                bigDecimal=bigDecimal.add(new BigDecimal(i));
            }

        }
        bigDecimal = bigDecimal.add(new BigDecimal("1"));
        String s = bigDecimal.toString();

        if((n+"").equals(s)){
            System.out.println(s+"="+result);
        }

    }
}
