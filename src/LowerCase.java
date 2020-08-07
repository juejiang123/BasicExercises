public class LowerCase {
    public String ToLowerCase(String str){
        if(str.length()<0)return null;
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>'Z' || str.charAt(i)<'A'){
                res.append(str.charAt(i));
            }
            else if(str.charAt(i)>'A' && str.charAt(i)<'Z'){
                res.append((char)( str.charAt(i)+32));
            }
        }
        String s = res.toString();
        return s;

    }

    public static void main(String[] args) {
        String s = "who are you HHHHH";
        LowerCase lowerCase= new LowerCase();
        String s1 = lowerCase.ToLowerCase(s);
        System.out.println(s1);

    }
}
