package StreamTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ConversionTest {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk.txt"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf81.txt"),"utf-8");
        int len =0;
        while ((len=isr.read())!=-1){
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
