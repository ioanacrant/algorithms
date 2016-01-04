import java.util.*;
public class Four1{
    public static void main(String[] args){
        int[] a = {0,1,3,5};
        System.out.print(decToHex(35, ""));

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
    public static String decToHex(int dec, String sofar){
		if (dec==0){
			return sofar;
		}
		char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E','F'};
		int power = 0;
		while (Math.pow(16,power)<=dec){
			power++;
		}
		int powerTaken = (int) Math.pow(16,power-1);

		int mults = dec/powerTaken;
		sofar+=hexDigits[mults];

		return decToHex(dec - powerTaken*mults, sofar);
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
