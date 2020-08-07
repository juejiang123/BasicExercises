package File;

import java.io.File;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) throws IOException {
//        String sepa = File.separator;
//        System.out.println(sepa);
//        String pathSeparator = File.pathSeparator;
//        System.out.println(pathSeparator);
//        File file = new File("/Users/tianqingxia/Desktop/1/2/jj.txt");
//        System.out.println(file.length());
//        boolean newFile = file.createNewFile();
//        System.out.println(newFile);
//        boolean delete = file.delete();
//        System.out.println(delete);
//        File file1 = new File("/Users/tianqingxia/Desktop/1/2/3");
//        boolean newFile1 = file1.mkdir();
//        System.out.println(newFile1);
//        System.out.println("=======================");
        File file2 = new File("/Users/tianqingxia/Desktop/AutoTest/study");
//        String[] list = file2.list();
//        for(String f : list){
//            System.out.println(f);
//        }
//        File[] files = file2.listFiles();
//        for(File f : files){
//            System.out.println(f);
//        }
        getAllFile(file2);



    }

    public static void getAllFile(File file){
        File[] files = file.listFiles(new FileFilterImpl());
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
