public class ReverseString {
    public String reverseString(String s){
        String[] s1 = s.split(" ");
        StringBuilder res= new StringBuilder();
        for(int i=0,j=s1.length-1;i>=0 && j<s1.length;i++,j--){
            String temp = null;
            temp = s1[i];
            s1[i] = s1[j];
            s1[j] = temp;
            res.append(new StringBuffer(s1[i])+" ");

        }
        String s2 = res.toString();
        return s2;
    }
//目前的代码未进行空格过滤，需要先过滤空格

    public static void main(String[] args) {
        String s = "  what are you   saying  ";
        ReverseString reverseString= new ReverseString();
        String s1 = reverseString.reverseString(s);
        System.out.println(s1);
    }

}

