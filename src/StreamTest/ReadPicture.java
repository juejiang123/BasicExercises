package StreamTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadPicture {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/tianqingxia/Desktop/WX20200719-230112.png");
        FileOutputStream fos = new FileOutputStream("/Users/tianqingxia/Desktop/12.png");
        int len=0;
//        while ((len =fis.read())!=-1){
//            fos.write(len);
//        }

        byte[] buff = new byte[1024];
        while ((len = fis.read(buff))!=-1){
            fos.write(buff,0,len);
        }
        fos.close();
        fis.close();


    }
}
