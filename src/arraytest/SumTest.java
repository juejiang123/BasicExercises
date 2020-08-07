package arraytest;

import java.util.HashMap;

/*
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/two-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SumTest {

    public static int[] arraySum(int[] nums,int target){
        int[] sub = new int[2];
        for(int i = 0; i< nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    sub[0] = i;
                    sub[1] = j;
                }
            }

        }
        return sub;
    }
    public static int[] liashuhe(int[] nums,int target){
        int[] sub = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int value = target - nums[i];
            if(map.containsKey(value)){
                sub[0] = map.get(value);
                sub[1] = i;
            }else {
                map.put(nums[i],i);
            }
        }
        return sub;
    }

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ints = arraySum(nums, target);
        for(int i : ints){
            System.out.println(i);
        }
        int[] liashuhe = liashuhe(nums, target);
        for(int j : liashuhe){
            System.out.println(j);
        }

    }
}
