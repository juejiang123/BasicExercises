import java.util.Scanner;

/**
题目：输入一行字符，分别统计出其英文字母，空格，数字和其它字符的个数
 分析：
 1。Scanner.next()接收字符串，设置scan的分隔符为\n换行符
 2。把字符串转换为字符数组，然后遍历
 3。判断在65-90和97-122是字母
 4。32的是空格
 5。48-57的是数字
 6。其它的是其它字符
 */
public class Test_43_07 {
    public static void main(String[] args) {
        System.out.println("请输入一行字符串：");
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        String s = scan.next();
//        classify(s);
        char[] c = s.toCharArray();
        int charCount =0;
        int blankSpaceCount =0;
        int numCount =0;
        int otherCount =0;
        for (int i = 0; i < c.length; i++) {
            if((c[i]>=65 &&c[i]<=90)||(c[i]>=97 &&c[i]<=122)){
                charCount++;
            }else if(c[i]==32){
                blankSpaceCount++;
            }else if(c[i]>=48 && c[i]<=57){
                numCount++;
            }else {
                otherCount++;
            }
        }
        System.out.println("字符数："+charCount);
        System.out.println("空格数："+blankSpaceCount);
        System.out.println("数字数："+numCount);
        System.out.println("其它数："+otherCount);

    }
//    public static void classify(String str){
//        char[] strArr = str.toCharArray();
//        int num1 = 0;  //字母
//        String num1Str = "";
//        int num2 = 0;  //数字
//        String num2Str = "";
//        int space = 0; //空格
//        String spaceStr = "";
//        int other = 0; //其他
//        String otherStr = "";
//        for (int i = 0; i < strArr.length ; i++) {
//            int ascii = (int)strArr[i];
//            if( 48<= ascii && ascii <= 59){
//                num2 = num2 + 1;
//                num2Str = num2Str +strArr[i] +" ";
//            }else if(ascii == 32){
//                space = space +1;
//            }else if((65<= ascii && ascii <= 90) || (97 <= ascii && ascii <=  122)){
//                num1 = num1 + 1;
//                num1Str = num1Str +strArr[i] +" ";
//            }else{
//                other = other + 1;
//                otherStr = otherStr +strArr[i] +" ";
//            }
//        }
//        System.out.println("存在字母个数:" + num1);
//        System.out.println("存在字母如下:" + num1Str);
//
//        System.out.println("存在数字个数:" + num2);
//        System.out.println("存在数字如下:" + num2Str);
//
//        System.out.println("存在空格个数:" + space);
//
//        System.out.println("存在其他个数:" + other);
//        System.out.println("存在其他如下:" + otherStr);
//
//    }
}
