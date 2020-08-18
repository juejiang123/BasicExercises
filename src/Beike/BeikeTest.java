package Beike;

import com.sun.tools.corba.se.idl.StringGen;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * A.log 
 * time,url,ip 
 * 9:00,ke.com/ershoufang/33.detail,10.10.10.1 
 * 9:00-21:00,url包含"ershoufang“字符串，出现频次最多的ip求出来 
 */
public class BeikeTest {

    public static  Map<String,Integer> getMap() throws IOException {
        FileInputStream fis = new FileInputStream("a.log");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String strLine;
        HashMap<String,Integer> map = new HashMap<>();
        while ((strLine=br.readLine())!=null){
//            System.out.println(strLine);
//            System.out.println("-----");
            String[] strings = strLine.split(",");
//            for(int i=0;i<strings.length;i++){
//                System.out.println(strings[i]);
//            }
            String regex = "^([9]|([1][0-9])|([2][0-1])):([0-5]![0-9])$";
            if(strings[0].matches(regex)){
                if(strings[1].contains("ershoufang")){
                    Integer count = map.get(strings[2]);
                    if(count==null){
                        map.put(strings[2],1);
                    }else {
                        map.put(strings[2],count+1);
                    }
                }
            }


        }

        return map;
    }

    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = getMap();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            Integer value = entry.getValue();
            String key = entry.getKey();
            System.out.println(key+":"+value);
        }
    }


}
