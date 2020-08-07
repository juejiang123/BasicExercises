package randomTest;
/*
生成指定范围内的数字，不含参数本身
 */
public class GetExtentRandomNumber {

    public static int getExtentRandomNumber(int extent){
        int number =(int)(Math.random()*extent);
        return number;

    }

    public static void main(String[] args) {
        int extentRandomNumber = getExtentRandomNumber(30);
        System.out.println(extentRandomNumber);
        int[] arr = {1,2};
        int[] arr1 = new int[2];
    }
}
