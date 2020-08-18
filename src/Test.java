//
public class Test {

    public static String maxPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }
        String temp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if(strs[i]==null || strs[i].length()<1){
                return "";
            }
            int min = Math.min(temp.length(), strs[i].length());
            for (int j = 0; j < min; j++) {
                if (temp.charAt(j) == strs[i].charAt(j)) {
                    System.out.println("当前相同");
                } else {
                    temp = strs[i].substring(0, j);
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        String[] strs = {"flow", "flower",""};
        String[] strings = {"flow","abc"};
        String s1 = maxPrefix(strings);
        System.out.println(s1);
//        String s = maxPrefix(strs);
//        System.out.println(s);
    }
}
