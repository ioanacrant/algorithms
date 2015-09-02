import java.util.*;
public class LengthOfLastWord{
    public static int lengthOfLastWord(String s){
        String[] ss = s.split(" ");
        if (ss.length==0){
            return 0;
        }
        return ss[ss.length-1].length();
    }
    public static void main(String[] args){
        System.out.print(lengthOfLastWord("h a tgf "));
    }
}
