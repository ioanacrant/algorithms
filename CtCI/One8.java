public class One8{
    public static boolean isRotation(String s1, String s2){
        if (s1.length()!=s2.length()){
            return false;
        }
        int len = s1.length();
        for (int i=0;i<len;i++){
            if (s1.substring(0,i).equals(s2.substring(len-i,len)) &&
                s1.substring(i,len).equals(s2.substring(0,len-i))){
                System.out.print(s2.substring(i));
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.print(isRotation("abca","aacb"));
    }
}
