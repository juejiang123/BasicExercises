package StringTest;

import java.util.HashMap;

public class LongestSubString {
    public static int lengthOfLongestSubString(String s){
        if(s==null || s.length() ==0)return 0;
        int from =0,to =0,length=1,maxLength =1;
        while (to<s.length()){
            int site = s.substring(from, to).indexOf(s.charAt(to));
            if(site !=-1){
                length = to-from;
                if(length > maxLength) maxLength = length;
                from = from+site+1;
            }
            to++;
        }
        if(to-from>maxLength){
            maxLength = to-from;
        }
        return maxLength;
    }

    public static void main(String[] strs){
        String s = "abeingdwlangdagneong";
        int i = lengthOfLongestSubString(s);
        System.out.println(i);


    }

}
