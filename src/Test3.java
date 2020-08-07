/**
 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个
 * "水仙花数"，因为153=1的三次方+5的三次方+3的三次方
 * 分析：
 * 1。水仙花数是指一个三位数100a+10b+c，100到999范围；
 * 2。a*a*a+b*b*b+c*c*c = 100a+10b+c
 * 3。打印所有的100a+10b+c
 */
public class Test3 {

    public static void main(String[] args) {
        for (int i=100;i<=999;i++){
           if(cubicNum(i)){
               System.out.println(i);
           }

        }
    }
    public static boolean cubicNum(int i){
        int a = i/100;
        int b = (i-100*a)/10;
        int c = i-100*a-10*b;

//        if(a*a*a+b*b*b+c*c*c == 100*a+10*b+c){
//            return true;
//
//        }
        if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)==100*a+10*b+c){
            return true;
        }
        return false;
    }
}
