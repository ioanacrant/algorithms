import java.util.*;

public class FactorialTrailingZeroes{
    public static int trailingZeroes(int n){
        int count = 0;
        while (n>1){
            n=(int)n/5;
            count+=n;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.print(trailingZeroes(12));
    }
}
