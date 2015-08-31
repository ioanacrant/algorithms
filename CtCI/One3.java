import java.util.*;

public class One3{
    public static boolean isPermutation(String a, String b){
        if (a.length()!=b.length()){
            return false;
        }
        int[] charA = new int[256];


        for (int i=0;i<a.length();i++){
            int letA = a.charAt(i);
            charA[letA]+=1;
        }

        for (int i=0;i<b.length();i++){
            int letB = b.charAt(i);
            charA[letB]--;

            if (charA[letB]<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print(isPermutation("aBc","cba"));
    }
}
