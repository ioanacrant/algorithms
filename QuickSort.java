import java.util.Arrays;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class QuickSort{
    static int count;
    public static void partition(int[] array, int start, int end){
        if(end-start>=2){
            int pivotIndex = end-1;
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
            count+=i-1-start;
            count+=end-i;
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
    public static void main(String[] args){
        int[]a1 = {6,2,3,1};
        partition(a1,0,a1.length);
        System.out.println(Arrays.toString(a1));
        System.out.println(count);

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
