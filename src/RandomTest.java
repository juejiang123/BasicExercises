import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int ii = r.nextInt();//范围是整个int类型数字
        int num = r.nextInt(10);//范围是【0，10）
        System.out.println(ii);
        System.out.println(num);
        for(int i=1;i<9;i++){
            int j =r.nextInt(10)+1;
            System.out.println(j);
        }

    }
}
