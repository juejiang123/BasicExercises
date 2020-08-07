/*
判断一个链表是否为回文结构(进阶)
给定一个链表，请判断该链表是否为回文结构。
 */
public class PalindromeTest {
    public int extendAroundCenter(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public Boolean PalindromeJudgment(int n,String s){
        if(n<1 || s==""){
            return false;
        }
        int center = (n-1)/2;
        if(center>=0){
            int i1 = extendAroundCenter(s, center, center+1);
            int i2 = extendAroundCenter(s,center,center);
            if(n==Math.max(i1,i2)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "nssss";
        int n=s.length();
        PalindromeTest palindrome= new PalindromeTest();
        Boolean judgment = palindrome.PalindromeJudgment(n, s);
        System.out.println(judgment);
    }
}
