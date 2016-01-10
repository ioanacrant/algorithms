import java.util.*;
public class Four1{
    public static void main(String[] args){

    }

    public int heightcheck(Node head){
        if (head==null){
            return 0;
        }
        int r = heightcheck(head.right);
        int l = heightcheck(head.left);
        if (r==-1 || l==-1){
            return -1;
        }
        if (abs(r-l)>1){
            return -1;
        }
        return 1+Math.max(r, l);
    }

}
class Node{
    int value;
    Node left;
    Node right;
    Node(int v){
        value = v;
    }
}
