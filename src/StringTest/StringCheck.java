package StringTest;/*
求一个字符串中出现次数前五多的单词
 */
import java.util.*;

public class StringCheck {
    public static Map<String,Integer> test(String s){
        String[] s1= s.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<s1.length;i++){
            if(map.containsKey(s1[i])){
                Integer num = map.get(s1[i]);
                System.out.println(num);
                num+=1;
                map.put(s1[i],num);
            }else{
                map.put(s1[i],1);
            }
        }


        return map;
    }
    private  static class ValueComparator implements Comparator<Map.Entry<String,Integer>>{
        public int compare(Map.Entry<String,Integer>m,Map.Entry<String,Integer>n){
            return n.getValue()-m.getValue();
        }
    }

    public static void main(String[] args) {
        String s = "ha hei ha hei ha hei hy uu";
        Map<String, Integer> test = test(s);
        List<Map.Entry<String,Integer>> list=new ArrayList<>();
        list.addAll(test.entrySet());
        ValueComparator vc=new ValueComparator();
        Collections.sort(list,vc);
        int num=0;
        for(Iterator<Map.Entry<String,Integer>> it=list.iterator();it.hasNext();){
            System.out.println(it.next());
            num++;
            if(num>=3){
                break;
        }

        }
    }
}
