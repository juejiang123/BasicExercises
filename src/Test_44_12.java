import java.util.Scanner;

/**
 * 题目：企业发放的奖金根据利润提成。利润（I）低于或者等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，
 * 可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，
 * 高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
 */
public class Test_44_12 {
    public static void main(String[] args) {
        System.out.println("请输入利润I是多少万：");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double sum = sum(i);
        System.out.println(sum);
    }
//    public static double sum(int n){
//        double sum = 0;
//        if(n<=10){
//            sum = n*0.1;
//        }
//        if(n>10 && n<=20){
//            sum = sum(10)+(n-10)*0.075;
//        }
//        if(n>20 && n<=40){
//            sum = sum(20)+(n-20)*0.05;
//        }
//        if(n>40 && n<=60){
//            sum = sum(40)+(n-40)*0.03;
//        }
//        if(n>60 && n<=100){
//            sum = sum(60)+(n-60)*0.015;
//        }
//        if(n>100){
//            sum = sum(100)+(n-100)*0.01;
//        }
//        return sum;
//    }
public static double sum(int n){
        double su = 0;
        if(n<=100000){
            su = n*0.1;
        }else
        if(n>100000 && n<=200000){
            su = sum(100000)+(n-100000)*0.075;
        }else
        if(n>200000 && n<=400000){
            su = sum(200000)+(n-200000)*0.05;
        }else
        if(n>400000 && n<=600000){
            su = sum(400000)+(n-400000)*0.03;
        }else
        if(n>600000 && n<=1000000){
            su = sum(600000)+(n-600000)*0.015;
        }else
        if(n>100){
            su = sum(1000000)+(n-1000000)*0.01;
        }
        return su;
    }
}
