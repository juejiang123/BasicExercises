package StringTest;

//最后一个单词的长度
public class StringLength {

    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (s.charAt(end) == ' ' && end >= 0) {
            end--;
        }
        if (end < 0) return 0;
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }

    public static void main(String[] args) {
        String words ="how are YOU";
        StringLength stringLength = new StringLength();
        int length = stringLength.lengthOfLastWord(words);
        System.out.println(length);
    }


}
