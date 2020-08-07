package StreamTest;

import java.io.FileWriter;
import java.io.IOException;
/*
字符输出流的续写和换行
 */
public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/tianqingxia/Desktop/1/2/a.txt",true);
        fw.write("你好");
        fw.flush();
        fw.write("\r你好");
        char[] cs = {'a','b','c'};
        fw.write(cs,1,2);
        fw.write("hello world",2,4);
        fw.close();

    }


}
