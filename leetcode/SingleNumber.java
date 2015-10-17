import java.util.*;
public class SingleNumber{
    public static int singleNumber(int[] nums){
        Arrays.sort(nums);
        for (int i=1;i<nums.length-1;i++){
            if (!(nums[i]==nums[i-1] || nums[i]==nums[i+1])){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int[] a = {1,1,2,3,3,4,4};
        System.out.print(singleNumber(a));
    }
}
