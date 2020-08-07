
import java.util.Scanner;

public class ArrayLength {

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,3,2};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
        System.out.println("+++++++++++++++++++");
        int[] reverse = reverse(array);
        for(int i=0;i<array.length;i++){
            System.out.println(reverse[i]);
        }
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        System.out.println(s);

    }

    public static int[] reverse(int[] array){
        int temp;
        for(int left=0,right=array.length-1;left<right;left++,right--){
            temp = array[right];
            array[right] = array[left];
            array[left] = temp;
        }

        return array;
    }




}
