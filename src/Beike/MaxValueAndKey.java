package Beike;

import java.io.IOException;
import java.util.*;

public class MaxValueAndKey {

    public static void MaxValue(Map<String,Integer> map){
        Collection<Integer> values = map.values();
        Object[] objects = values.toArray();
        Arrays.sort(objects);
        for(int i=0;i<objects.length;i++){
            System.out.println(objects[i]);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,(o2,o1)->(o2.getValue()-o1.getValue()));
        System.out.println(list.get(list.size()-1).getKey());
    }

    public static void main(String[] args) throws IOException {
        Map<String,Integer> sortMap = BeikeTest.getMap();
        MaxValue(sortMap);
    }
}
