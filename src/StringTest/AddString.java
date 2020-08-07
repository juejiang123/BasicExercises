package StringTest;

public class AddString {
    public static String addString(String s1,String s2){
        StringBuilder res = new StringBuilder("");
        int i= s1.length()-1,j=s2.length()-1,carry=0;
        while(i>=0 || j>=0){
            int n1= i>=0 ? s1.charAt(i)-'0':0;
            int n2= j>=0 ? s2.charAt(j)-'0':0;
            int tmp = n1+n2+carry;
            carry = tmp/10;
            res.append(tmp % 10);
            i--;j--;
        }
        if(carry==1) res.append(1);
        return res.reverse().toString();

    }

    public static void main(String[] args) {
        String s1="284";
        String s2="943";
        String s = addString(s1, s2);
        System.out.println(s);
        int a = 2;
        int b = 4;
        System.out.println(a+b);
        System.out.println("a+b = "+(a+b));

    }
}
