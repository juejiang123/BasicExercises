import java.util.Scanner;

/**
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，
 * 60分以下的用C表示
 * 分析：条件运算符是if..elif...
 * 输入一个分数，返回一个档位
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println("请输入学生的成绩：");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String fun = fun(i);
        System.out.println(fun);
    }
    public static String fun(int score){
        if(score>=90){
           return "A";
        }else if (score>=60 && score<=89){
            return "B";
        }else{
            return "C";
        }
    }
}
