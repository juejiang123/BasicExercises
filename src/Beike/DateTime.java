package Beike;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateTime {

    public static HashMap<String,Integer> DateTime() throws IOException, ParseException {
        FileInputStream fis = new FileInputStream("a.log");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String strLine = "";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        long minTime = sdf.parse("9:00").getTime();
        long maxTime = sdf.parse("21:00").getTime();
        HashMap<String,Integer> map = new HashMap<>();
        while ((strLine=br.readLine())!=null){
            String[] s = strLine.split(",");
            long time = sdf.parse(s[0]).getTime();
            if(time>=minTime && time<=maxTime){
                if(s[1].contains("ershoufang")){
                    Integer count = map.get(s[2]);
                    if(map.containsKey(s[2])){
                        map.put(s[2],count+1);
                    }else {
                        map.put(s[2],1);
                    }
                }
            }

        }
        return map;
    }

    public static void sortMap(HashMap<String, Integer> map){
        Collection<Integer> values = map.values();
        Object[] objects = values.toArray();
        Arrays.sort(objects);
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,(o1,o2)->(o1.getValue()-o2.getValue()));
//        Collections.sort();
        System.out.println(list.get(list.size()-1).getKey());

    }

    public static void main(String[] args) throws IOException, ParseException {
        HashMap<String, Integer> map = DateTime();
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        for(Map.Entry<String, Integer> entry : entries){
//            Integer value = entry.getValue();
//            String key = entry.getKey();
//            System.out.println(key+":"+value);
//        }
        sortMap(map);
    }
}
