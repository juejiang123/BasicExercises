import java.util.Stack;

public class ReverseLetter {
    public String reverseOnlyLetter(String s){
        Stack<Character> letters= new Stack<>();
        for(char c : s.toCharArray()){
            if(Character.isLetter(c))
                letters.push(c);
        }
        StringBuilder stringBuilder= new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c))
                stringBuilder.append(letters.pop());
            else
                stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "lllll hao la hahah";
        ReverseLetter letter=new ReverseLetter();
        String s1 = letter.reverseOnlyLetter(s);
        System.out.println(s1);
    }
}
