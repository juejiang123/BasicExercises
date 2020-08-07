public class MathTest {
    public static void main(String[] args) {
        int count =0;
        double min = -10.8;
        double max = 5.9;

        for(double i=Math.ceil(min);i<=Math.floor(max);i++){
            double num = Math.abs(i);
            if(num>6 || num <2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
