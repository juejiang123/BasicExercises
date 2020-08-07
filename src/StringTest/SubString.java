package StringTest; /**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */

import java.util.HashMap;
import java.util.Map;

public class SubString {
    public int lengthOfLongestSubString(String s){
        int res=0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int left=0,right=0;right<s.length();right++){
            if(hashMap.containsKey(s.charAt(right))){
                left = Math.max(left,hashMap.get(s.charAt(right))+1);
            }
            hashMap.put(s.charAt(right),right);
            res = Math.max(res,right-left+1);
        }
        return res;
    }

    public static void main(String[] strs){
        String s = "abcdcdabe";
        SubString subString = new SubString();
        int i = subString.lengthOfLongestSubString(s);
        System.out.println(i);
//        Map<String,String> hashMap = new HashMap<>();
//        hashMap.put("1","2");
//        hashMap.put("2","3");
//        for( Map.Entry<String,String>entry : hashMap.entrySet()){
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key +":"+value);
//        }

    }
}
