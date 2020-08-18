public class RegexTest {

    public static void main(String[] args) {
        String s= "2018-08-20 04:23";
        String as = "04:23";
        String regex = "^(([1-9]{1})|([0-1][0-9])|([1-2][0-3])):([0-5][0-9])$";
        boolean matches = s.matches(regex);
        System.out.println(as.matches(regex));
        System.out.println(matches);
    }
}
