/**
 * 题目：古典问题：有一对兔子，从出生后第3个月起每一个月都生一对兔子，小兔子长到第三个月又生一对兔子，假如兔子都不死，
 * 问，每个月的兔子对数为多少？
 */
public class Test1 {
    public static void main(String[] args) {
        int i = fun(5);
        System.out.println(i);
    }
    public static int fun(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fun(n-1)+fun(n-2);
    }
}
