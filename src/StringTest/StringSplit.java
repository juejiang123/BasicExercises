package StringTest;

public class StringSplit {
    public static void main(String[] args) {
        String str=new String("welcome to beijing && tianjin");
        String[] s = str.split(" ");
        for(String i : s){
            System.out.println(i);
        }
        String[] split = str.split("&&");
        for (String s1 :split){
            System.out.print(s1);
        }
        System.out.println("");

        String[] split1 = str.split("", 6);
        System.out.println(split1[5]);

    }
}
