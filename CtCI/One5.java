import java.util.*;

public class One5{
    public static String compress(String origs){
        String news = "";
        int i=0;
        while (i<origs.length()){
            char cur = origs.charAt(i);
            int count = 0;
            while (i<origs.length() && origs.charAt(i)==cur){
                count++;
                i++;
            }
            news+=""+cur;
            news+=""+count;
        }
        if (origs.length()<news.length()){
            return origs;
        }
        return news;

    }
    public static void main(String[] args){
        System.out.print(compress("aaaabbccaa"));
    }
}
