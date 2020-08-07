import java.util.Scanner;

/**
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；n次落地经过路线总长度和下次反弹的高度。
 * 分析：
 * 第一次下落，高度是100米，经过路线是100米
 * 第二次下落，高度是50米，经过路线是100+50*2米
 * 第三次下落，高度是25米，经过路线是100+50*2+25*2米
 */
public class Test_43_10 {
    public static void main(String[] args) {
        System.out.println("请输入落地次数：");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        high(i);

    }
    public static void high(int n){
        double height =100;
        double s = 0;
        for(int i=1;i<=n;i++){
            if(i==1){
                s =s+height;
            }else {
                s= height *2+s;
            }
            height = height/2;

        }
        System.out.println("第"+n+"次落地后，经过路线总长度为"+s+",下次反弹高度是"+height);
    }
}
