import java.util.ArrayList;

/*
两数之和
给定一个整数数组nums和一个目标值target,请你在该数组中找出和为目标值得那两个整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 */
public class SumTest {

    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        SumTest sumTest = new SumTest();
        ArrayList<Integer> arrayList = sumTest.subId(array);
        for (Integer i:arrayList){
            System.out.println(i);
        }
        int[] ints = sumTest.twoSum(array, 9);
        for(int i:ints){
            System.out.println(i);
        }


    }
    public ArrayList<Integer> subId(int[] array){
        int target = 9;
        ArrayList<Integer> arrayList= new ArrayList<>();
        for(int i=0;i<=array.length-1;i++){
            for(int j=i+1;j<=array.length-1;j++){
                if(array[i]+array[j]==target){
                    arrayList.add(i);
                    arrayList.add(j);
                }
            }
        }
        return arrayList;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }


}
