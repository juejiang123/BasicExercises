import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/*
计算一个字符串中每个字符出现的次数
 */
public class MapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c :s.toCharArray()){
            if(map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else {
                map.put(c,1);
            }
        }
        for(Character key :map.keySet()){
//            System.out.println(key);
            Integer value = map.get(key);
            System.out.println(key + ":"+value);
        }
        Collection<Integer> values = map.values();
        for(Integer i : values){
            System.out.println(i);
        }

    }
}
