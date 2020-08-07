package Recursion;

import java.io.File;

public class DemoRecrusion {
    public static void main(String[] args) {
        File file = new File("/Users/tianqingxia/Desktop/AutoTest");
        getAllFile(file);

    }
    public static void getAllFile(File file){
        File[] files = file.listFiles();
        for(File f:files){
            if(f.isDirectory()){
                getAllFile(f);
            }else {
                String s = f.toString();
                boolean b1 = s.toUpperCase().endsWith(".JAVA");
                boolean b = s.endsWith(".java");
                if(b){
                    System.out.println(f);
                }
                if(b1){
                    System.out.println(f);
                }

            }

        }
    }

}
