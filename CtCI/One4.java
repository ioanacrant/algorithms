import java.util.*;

public class One4{
    public static char[] replace(char[] string){
        for (int i=0;i<string.length;i++){
            if (string[i]==' '){
                shift(i, string);
                System.out.println(string);
                string[i]='%';
                string[i+1]='2';
                string[i+2]='0';
            }
        }
        return string;
    }

    public static void shift(int n, char[] s){
        for(int i=s.length-1;i>n;i--){
            if (s[i]!=' '){
                s[i+2]=s[i];
            }
        }
    }
    public static void main(String[] args){
        char[] a = "a bc d    ".toCharArray();
        System.out.print(replace(a));

    }
}
