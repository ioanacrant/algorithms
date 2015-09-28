import java.util.*;

public class ValidAnagram{
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }

        int[] a = new int[256];

        for (int i = 0; i<s.length(); i++){
            a[s.charAt(i)]++;
            a[t.charAt(i)]--;
        }

        for (int c: a){
            if (c!=0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args){
        System.out.print(isAnagram("abc", "cba"));
    }

}
