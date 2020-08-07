/*
我们首先检查是否rev大于Integer.MAX_VALUE / 10（214748364）。
如果它更大，则不存在反向整数。
如果不是，那么rev小于或等于Integer.MAX_VALUE / 10。
如果它小于Integer.MAX_VALUE / 10，那么即使我们乘以它10，我们也可以添加任何数字（pop），我们不会超过Integer.MAX_VALUE。但是，如果它等于Integer.MAX_VALUE / 10，那么我们必须确保pop不是> 7（2147483647 - 214748364 * 10）因为否则我们会超过Integer.MAX_VALUE
 */
public class ReverseNum {
    public static void main(String[] args){
        ReverseNum reverseNum = new ReverseNum();
        int reverse = reverseNum.reverse(-67);
        System.out.println(reverse);
    }

    public int reverse(int x){
        int rev =0;
        while(x!=0){
            int pop = x % 10;
            x /= 10;
            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && pop>7))
                return 0;
            if(rev<Integer.MIN_VALUE/10 || (rev ==Integer.MIN_VALUE/10 && pop <-8))
                return 0;
            rev = rev*10 + pop;
        }
        return rev;
    }
}
