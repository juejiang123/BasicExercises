package StringTest;

public class subStringTest {

    public static void main(String[] args) {
        String a = "ae";
        String b = "abc";
        subStringCount(a,b);
        int count = count(a, b);
        System.out.println(count);
    }

    public static void subStringCount(String a,String b){
        int count =0;
        if(a.contains(b)){
            String[] split = a.split(b);
            System.out.println(split.length);
            for (int i=0;i<split.length;i++){
                System.out.println(split[i]);
            }
            count = split.length-1;
            System.out.println(count);
        }
    }

    public static int count(String a,String b){
        int count=0;
        if(a.contains(b)){
            String[] arr = a.split(b);
            System.out.println(arr.length);
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            count = arr.length-1;
            return count;

        }else{
            return count;
        }

    }
}
