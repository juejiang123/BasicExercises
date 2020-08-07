/**
 * 题目：一个整数，它加上100后是个完全平方数，再加上168又是个完全平方数，请问该数是多少？
 * 分析：
 */
public class Test_45_13 {
    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            double x = Math.sqrt(i + 100);
            double y = Math.sqrt(i + 268);
            if(x==(int)x && y==(int)y){
                System.out.println(i);
            }
        }
    }
}
