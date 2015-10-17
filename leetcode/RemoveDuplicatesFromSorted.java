import java.util.*;
public class RemoveDuplicatesFromSorted{
    public static int removeDuplicates(int[] nums){
        int lastSortIndex = 0;
        int i=0;
        while (i<nums.length){
            int cur = nums[i];
            while(i<nums.length && nums[i]==cur){
                i++;
            }
            swap(nums, lastSortIndex, i-1);
            lastSortIndex++;
        }
        return lastSortIndex;
    }
    public static void swap(int[]nums, int a, int b){
        int x = nums[a];
        int y= nums[b];
        nums[a]=y;
        nums[b]=x;
    }
    public static void main(String[] args){
        int[] a = {1,1,1,2,2,3,4,4};
        System.out.println(removeDuplicates(a));
        System.out.println(Arrays.toString(a));
    }
}
