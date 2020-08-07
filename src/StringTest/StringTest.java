package StringTest;

public class StringTest {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] chars = {'a','b','c'};
        String str3 = new String(chars);

        byte[] bytes = {97,98,99};
        String str4 = new String(bytes);
        System.out.println(str4);
        System.out.println(str3);
        System.out.println(bytes);
        System.out.println(chars);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        System.out.println(str3 == str4);
        String str6 = null;
//        System.out.println(str6.equals("abc"));//不推荐，会报空指针问题
        System.out.println("abc".equals(str6));
        int length = str1.length();
        System.out.println(length);
        String str11 = "helloworld";
        String substring = str11.substring(5);
        String substring1 = str11.substring(3, 6);
        System.out.println(str11);
        System.out.println(substring);
        System.out.println(substring1);
        System.out.println("=======================");
        int[] array = {1,2,3};
        String s = fromArrayToString(array);
        System.out.println(s);


    }
    public static String fromArrayToString(int[] array){
        String s="[";
        for(int i=0;i<array.length;i++){
            if(i==array.length-1){
                s += "word" + array[i] +"]";
            }else {
                s += "word"+array[i]+"#";
            }

        }
        return s;

    }
}
