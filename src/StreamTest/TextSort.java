package StreamTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

/*
文本排序
 */
public class TextSort {
    public static void main(String[] args) throws Exception{
        HashMap<String,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("出师表.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("出师表2.txt",true));
        String line;
        while ((line=br.readLine())!=null){
            String[] split = line.split("\\.");
            map.put(split[0],split[1]);


        }
        for(String key : map.keySet()){
            String value = map.get(key);
            System.out.println(key+"."+value);
            line = key +"."+value;
            bw.write(line);
            bw.newLine();

        }
        for(String key : map.keySet()){
            String value = map.get(key);
            System.out.println(key+"."+value);
            line = key +"."+value;
            bw.write(line);
            bw.newLine();

        }
        bw.close();
        br.close();


    }
}
