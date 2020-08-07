/*题目：给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
方法二：中心扩展算法
 */
public class Palindrome {

    public int expandAroundCenter(String s,int left,int right){
        int L = left;
        int R = right;
        while(L>=0 && R<s.length() && s.charAt(L)==s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }

    public String longestPalindrome(String s){
        if(s==null || s.length()<1)
            return "";
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len>end-start+1){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        /*
        end+1是end-start+1=len的计算分离结果
         */
        return s.substring(start,end+1);
    }

    public static void main(String[] args){
        Palindrome p= new Palindrome();
        String s="neneenen";
        String s1 = p.longestPalindrome(s);
        System.out.println(s1);
    }
}
