package StreamTest;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class BufferedOutPutStreamTest {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("hello","hhh");
        prop.setProperty("hi","what");
        prop.setProperty("who","where");
        long start = System.currentTimeMillis();
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
        prop.store(bw,"buffer");
        BufferedReader br = new BufferedReader(new FileReader("a.txt"),1024);
        String line=null;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println("================");
        Properties prop1 = new Properties();
        prop1.load(br);
        Set<String> set = prop1.stringPropertyNames();
        for(String key : set){
            String value = prop1.getProperty(key);
            System.out.println(key+":"+value);
        }

    }
}
