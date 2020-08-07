import java.util.Scanner;

/**
 * 题目：将一个正整数分解质因数。例如：输入90，打印出90=2*3*3*5
 * 分析：
 * 1。输入一个正整数，scanner(system.in),判断int数据大于0；
 * 2。定义一个方法，decompose(n)，
 *
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String out = n+"=";
        if(isPrimeNum(n)){
            out = out +n;
        }
        else {
            while (n!=1){
                for (int i=2;i<=n;i++){
                    if(n==i){
                        n=1;
                        out = out +i;
                        break;
                    }
                    if(n%i==0){
                        n=n/i;
                        out = out + i+"x";
                    }
                }
            }
            System.out.println(out);
        }

    }
    public static boolean isPrimeNum(int n){
        boolean flag = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }



}
