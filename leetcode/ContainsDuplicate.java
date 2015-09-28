import java.util.*;
public class ContainsDuplicate{
    public static boolean containsDuplicate(int[] nums){
        // Arrays.sort(nums);
        // for (int i=0;i<nums.length-1;i++){
        //     if (nums[i]==nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;
        HashSet a = new HashSet();
        for (int i: nums){
            if (!a.add(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int[] a= {1,2,3,2};
        System.out.print(containsDuplicate(a));
    }
}
