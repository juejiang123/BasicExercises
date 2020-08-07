/**
 * 题目：有1，2，3，4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * 分析：把组合成的3位数都计算出来，if条件排除相同的
 */
public class Test_44_11 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                for(int k=1;k<=4;k++){
                    if(i!=j && i!=k && j!=k){
                        count++;
                        System.out.println("请输出这些三位数:"+i+j+k);
                    }
                }
            }
        }
        System.out.println(count);
    }
}
