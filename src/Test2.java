import java.util.ArrayList;

/**
 * 题目：判断101-200之间有多少个素数，并输出所有素数
 * 分析：
 * 1。素数是只能被1，本身整除的数
 * 2。计算101-200范围内出素数数量，count++
 * 3。输出所有素数，素数放到集合里
 */
public class Test2 {
    public static void main(String[] args) {
//        System.out.println("llll");
        int count=0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=101;i<=200;i++) {
            if(isPrimeNumber(i)){
                count++;
//                System.out.println(i);
                arr.add(i);
            }

        }
        System.out.println(count);
        System.out.println("------");
        System.out.println(arr);
    }
    public static boolean isPrimeNumber(int i){
        boolean flag = true;
        for (int j=2;j<=i/2;j++){
            if(i%j==0){
                flag = false;
                break;
            }
        }
        return flag;
    }

}
