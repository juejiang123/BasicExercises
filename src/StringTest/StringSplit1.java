package StringTest;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSplit1 {
    public static void main(String[] args) {
        String s = "appium -p 4490 -bp 2253 -U 127.0.0.1:62321";
        System.out.println(s.split("-p ")[1].split(" -bp")[0]);
        int anInt = getInt(s, 0);
        System.out.println(anInt);

    }
    public static int getInt(String s,int index){
        Pattern p = Pattern.compile("\\d{5,}");//1是指的连续数字的最少个数
        Matcher matcher = p.matcher(s);
        List<Integer> result = new ArrayList<>();
        while (matcher.find()){
            String group = matcher.group();
            System.out.println(group);
            result.add(Integer.valueOf(matcher.group()));
        }
        if(!result.isEmpty()&&index<result.size()){
            return result.get(index);
        }else {
            System.out.println("你要找的"+(index+1)+"组数字不存在");
            return -1;
        }
    }

}
