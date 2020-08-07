package StreamTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class OutPutStream {
    public static void main(String[] args) throws Exception{
//        FileOutputStream fos=new FileOutputStream("/Users/tianqingxia/Desktop/1/2/a.txt",true);
//        fos.write("你好".getBytes());
//        fos.write("\r\n".getBytes());
//        fos.write("你好".getBytes());
//        fos.close();
        FileInputStream fis = new FileInputStream("/Users/tianqingxia/Desktop/1/2/a.txt");
        byte[] bytes = new byte[40];
//        int read2 = fis.read();
//        int read3 = fis.read();
        int len =0;
//        while ((len = fis.read())!=-1){
//            System.out.println(len);//流调用一次read方法读取的返回的值是字节,流读取完毕后返回-1
//            System.out.println(new String(bytes));
//        }
//        while ((len=fis.read(bytes))!=-1){
//            System.out.println(len);//读取的有效字节个数，当读到结束标记的时候会直接返回，当结束的时候返回结果也是-1
//            System.out.println(new String(bytes));
//            System.out.println();
//        }

        int len1 = fis.read(bytes);
        int len2 = fis.read(bytes);
        int len3 = fis.read(bytes);
        System.out.println(len1+" "+len2+" "+len3+" ");

//        int read = fis.read(bytes);
//        int read1 = fis.read(bytes);
//        System.out.println(read2);
//        System.out.println("====");

//        System.out.println(read);
////        System.out.println(read1);
//        System.out.println(Arrays.toString(bytes));
//        System.out.println(new String(bytes));
//        System.out.println(111);
        fis.close();
    }

}
