import java.util.*;
public class AddDigits{
    public static int addDigits(int num){
        while (num>9){
            int n = num;
            int count = 0;
            while (n>0){
                count+=n%10;
                n = (int)n/10;
            }
            num = count;
        }
        return num;
    }
    public static int fastAddDigits(int num){
        if (num == 0){
            return 0;
        }
        if (num%9==0){
            return 9;
        }

        return num%9;
    }
    public static void main(String[] args){
        System.out.print(fastAddDigits(38436));
    }
}
