import java.util.ArrayList;
import java.util.HashMap;

//数组排序之后相邻数的最大差值
//给定一个整形数组arr，返回排序后相邻两数的最大差值
//arr = [9, 3, 1, 10]。如果排序，结果为[1, 3, 9, 10]，9和3的差为最大差值，故返回6。
//arr = [5, 5, 5, 5]。返回0。
//[要求]
//时间复杂度为O(n)，空间复杂度为O(n)
public class SortAndDiff {

        public static int test(int num,int[] arr){
            int[] array= new int[num];
            int tmp=0;
            int number=0;
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        tmp = arr[i];
                        arr[i]= arr[j];
                        arr[j]=tmp;
                        array[i]=tmp;

                    }
                    number=Math.max(number,Math.abs(arr[i]-arr[j]));
                }


            }
            return number;
        }
        public static void main(String[] args) {
            int[] arr={9,1,3,5,2};
            int[] arr1={4,4,4,4};
            int n=test(4,arr);
            System.out.println(n);
            int n1= test(4,arr1);
            System.out.println(n1);
        }



}
