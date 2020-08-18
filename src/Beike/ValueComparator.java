package Beike;

import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ValueComparator implements Comparator<String> {

    Map<String,Integer> base;

    public ValueComparator(Map<String,Integer> base){
        this.base = base;
    }

    @Override
    public int compare(String o1, String o2) {
        if(base.get(o1)>=base.get(o2)){
            return 0;
        }else {
            return 1;
        }
    }

    public static <K,V extends Comparable<V>> Map<K,V> sortByValues(final Map<K,V> map){
        Comparator<K> valueComparator = new Comparator<K>() {
            @Override
            public int compare(K o1, K o2) {
                int compare = map.get(o2).compareTo(map.get(o1));
                if(compare==0)
                    return 1;
                else
                    return compare;

            }
        };
        Map<K, V> kvTreeMap = new TreeMap<>(valueComparator);
        kvTreeMap.putAll(map);
        return kvTreeMap;

    }

    public static void main(String[] args) throws IOException {
        Map<String,Integer> sortMap = BeikeTest.getMap();
        Map<String, Integer> kvMap = sortByValues(sortMap);
        Set<Map.Entry<String, Integer>> entries = kvMap.entrySet();
        Map.Entry<String, Integer> next = entries.iterator().next();
        System.out.println(next.getKey()+":"+next.getValue());

    }
}

