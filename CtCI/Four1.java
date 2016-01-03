import java.util.*;
public class Four1{
    public static void main(String[] args){
        int[] a = {0,1,3,5};
        printMissing(a);
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
        if (r-l<=1){
            return -1;
        }
        return 1+Math.max(r, l);
    }
    public static void printMissing(int[] sortedArray){
		int placeHolder = 0;
		for (int i=0;i<100;i++){
            if (placeHolder==sortedArray.length){
				System.out.println(i);
			}
			else if (sortedArray[placeHolder] == i){
				placeHolder++;
			}
			else{
				System.out.println(i);
			}
		}
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
