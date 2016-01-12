import java.util.*;
class Nine5{
    public static void main(String[] args){
        System.out.print(permutations("abc"));
    }
    public static ArrayList<String> permutations(String str){
        if (str.length()==1){
            ArrayList<String> r = new ArrayList<String>();
            r.add(str);
            return r;
        }
        return insertAtEach(permutations(str.substring(0,str.length()-1)), str.substring(str.length()-1, str.length()));
    }
    public static ArrayList<String> insertAtEach(ArrayList<String> before, String chr){
        ArrayList<String> newList = new ArrayList<String>();
        for (String s:before){
            for (int i=0;i<s.length()+1;i++){
                newList.add(s.substring(0,i)+chr+s.substring(i,s.length()));
            }
        }
        return newList;
    }
}
