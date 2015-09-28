public class ClimbingStairs{
    public static int climbStairs(int n){
        int[] steps = new int[n+3];
        steps[1]=1;
        steps[2]=2;
        for (int i=3;i<n+1;i++){
            steps[i]+=steps[i-1]+steps[i-2];
        }
        return steps[n];
    }
    public static void main(String[] args){
        System.out.print(climbStairs(4));
    }

}
