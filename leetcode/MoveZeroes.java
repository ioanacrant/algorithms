import java.util.*;
public class MoveZeroes{
    public static void moveZeroes(int[] nums){
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                for (int j=i+1;j<nums.length;j++){
                    if (nums[j]!=0){
                        swap(nums, i, j);
                        break;
                    }
                }
            }
        }
    }
    public static void swap(int[] nums, int i, int j){
        int a  = nums[i];
        int b = nums[j];
        nums[i]=b;
        nums[j]=a;
    }
    public static void main(String[] args){
        int[] a = {0,1,0,0,3,12};
        moveZeroes(a);
        System.out.print(Arrays.toString(a));
    }
}
