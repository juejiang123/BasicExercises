package StringTest;

public class StringSort {

    public String reverseWords(String s){
        String[] s1 = s.split(" ");
        StringBuilder res= new StringBuilder();
        for(String s2 : s1){
            res.append(new StringBuffer(s2).reverse()+" ");
        }
        System.out.println(res);
        String s2 = res.toString().trim();
        return s2;
    }

    public static void main(String[] args) {
        String s= "llleeng wlen sell ss";
        StringSort stringSort= new StringSort();
        stringSort.reverseWords(s);
    }
}
