package StringTest;

public class TypeChange {
    public static void main(String[] args) {
        int i1 = 100;
        String s1 = ""+i1;
        System.out.println(s1);

        String s = Integer.toString(100);
        String s3 = String.valueOf(100);
        System.out.println(s+s3);

        int s2 = Integer.parseInt("100");
        System.out.println(s2);
    }



}
