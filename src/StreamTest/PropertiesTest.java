package StreamTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) throws Exception{
        Properties prop = new Properties();
        prop.setProperty("zhaoliying","18");
        prop.setProperty("zhaoliyin","17");
        prop.setProperty("zhaoliyi","16");
        prop.setProperty("zhaoli","18");
        FileWriter fw = new FileWriter("a.txt",true);
        prop.store(fw,"save data");
        FileReader fr = new FileReader("a.txt");
        Properties prop1 = new Properties();
        prop1.load(fr);
        Set<String> set = prop1.stringPropertyNames();
        for(String key : set){
            String value = prop1.getProperty(key);
            System.out.println(key+":"+value);
        }
    }
}
