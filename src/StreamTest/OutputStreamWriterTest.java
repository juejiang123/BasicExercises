package StreamTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {
    public static void main(String[] args) throws Exception{
        write_gbk();
        write_utf_8();
        read_gbk();
        System.out.println("================");
        read_utf_8();
    }
    public static void write_gbk() throws Exception {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt",true),"gbk");
        osw.write("你好");
        osw.flush();
        osw.close();
    }

    public static void write_utf_8() throws Exception{
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf8.txt"),"utf-8");
        osw.write("你好");
        osw.flush();
        osw.close();
    }

    public static void read_gbk() throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk.txt"),"gbk");
        int len = 0;
        while((len=isr.read()) !=-1){
            System.out.println((char) len);
        }
    }


    public static void read_utf_8() throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("utf8.txt"),"utf-8");
        int len = 0;
        while((len=isr.read()) !=-1){
            System.out.println((char)len);
        }
    }
}
