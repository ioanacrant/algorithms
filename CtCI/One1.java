import java.util.*;

public class One1{
    public static boolean checkIfUnique(String s){
        Hashtable<String, Integer> letters = new Hashtable<String, Integer>();
        for (int i=0; i<s.length(); i++){
            String l = s.substring(i,i+1);
            System.out.println(l);
            if (letters.get(l)!=null){
                return false;
            }
            else{
                letters.put(l,1);
            }
        }
        return true;
    }
    public static boolean checkIfUniqueWithoutDataStructures(String s){
        char[] charArr = s.toCharArray();
        int[] asciis = new int[200];

        for (char c: charArr){
            int ascii = (int) c;
            if (asciis[ascii]==1){
                return false;
            }
            else{
                asciis[ascii]=1;
            }
        }
        return true;
    }

    public static void main(String[] args){
        //System.out.print(checkIfUnique("ab"));
        System.out.print(checkIfUniqueWithoutDataStructures("ab"));
    }
}
