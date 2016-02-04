import java.util.*;
class Nine6{
    public static void main(String[] args){
        System.out.print(combParentheses(3));
    }
    public static ArrayList<String> combParentheses(int n){
        if (n==1){
            ArrayList<String> a = new ArrayList<String>();
            a.add("()");
            return a;
        }
        return addParen(combParentheses(n-1));
    }
    public static ArrayList<String> addParen(ArrayList<String> before){
        ArrayList<String> after = new ArrayList<String>();
        for (String p:before){
            after.add("("+p+")");
            after.add(p+"()");
            if (isNotAPalindrome(p+"()")){ 
                after.add("()"+p);
            }
        }
        return after;
    }
    public static boolean isNotAPalindrome(String p){
        for (int i=0;i<p.length();i++){
            if (p.charAt(i)==p.charAt(p.length()-i-1)){
                return true;
            }
        }
        return false;
    }
}
