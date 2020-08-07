package StringTest;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String next = sc.next();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        char[] chars = next.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if ('A' <= aChar && 'Z' >= aChar) {
                countUpper++;
            } else if ('a' <= aChar && 'z' >= aChar) {
                countLower++;
            } else if ('0' <= aChar && '9' >= aChar) {
                countNumber++;
            }else{
                countOther++;
            }
        }
        System.out.println(countLower);
        System.out.println(countUpper);
        System.out.println(countNumber);
        System.out.println(countOther);

    }
}
