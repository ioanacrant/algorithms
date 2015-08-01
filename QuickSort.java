import java.util.Arrays;
import java.util.Random;
import java.lang.Math;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class QuickSort{
    static int count;
    public static void partition(int[] array, int start, int end){
        if(end-start>=2){
            int a = array[start];
            int b;
            if ((end-start)%2==0 ){
                b = array[((end-start)/2)-1+start];
            }else{
                b = array[((end-start)/2)+start];
            }

            int c = array[end-1];

            int median = median(a,b,c);

            int pivotIndex;
            if (median == array[start]){
                pivotIndex = start;
            }
            else if ((end-start)%2==0 && median == array[(end-start)/2-1+start]){
                pivotIndex = (end-start)/2-1+start;
            }
            else if ((end-start)%2==1 && median == array[(end-start)/2+start]){
                pivotIndex = (end-start)/2+start;
            }
            else if (median == array[end-1]){
                pivotIndex = end-1;
            }
            else{
                System.out.println("no");
                pivotIndex = end-1;
            }
            swap(array, start, pivotIndex);
            int pivot = array[start];
            int i=start+1;
            for (int j=start+1;j<end;j++){
                if (array[j]<pivot){
                    swap(array,j,i);
                    i++;
                }
            }
            swap(array,start,i-1);
            count+=end-start-1;
            partition(array,start,i-1);

            partition(array,i,end);

        }
    }
    public static int[] swap(int[] array, int index1, int index2){
        int a=array[index1];
        int b=array[index2];
        array[index2]=a;
        array[index1]=b;
        return array;
    }
    public static int median(int a,int b,int c){
        if (a < b){
            if( b < c){
                return b;
            }if (a < c){
                return c;
            }return a;
        }else{
            if (a < c){
                return a;
            }if (b < c){
                return c;
            }return b;
        }
    }
    public static void main(String[] args){
        BufferedReader br=null;
        try{
          br = new BufferedReader(new FileReader("QuickSort.txt"));
          int[] orig=new int[10000];
          for (int i=0;i<10000;i++){
            orig[i]=Integer.parseInt(br.readLine());
          }
          partition(orig,0,orig.length);
          System.out.println(count);
        }
        catch (IOException e){
          e.printStackTrace();
        }



    }
}
