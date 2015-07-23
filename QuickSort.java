import java.util.Arrays;
import java.util.Random;
public class QuickSort{
    public static void partition(int[] array, int start, int end){
        if(end-start>=2){
            Random rand= new Random();
            int pivotIndex = rand.nextInt(end-start)+start;

            array=swap(array,start,pivotIndex);
            int pivot = array[start];
            System.out.println(pivot);
            int i=start+1;
            for (int j=start+1;j<end;j++){
                if (array[j]<pivot){
                    swap(array,j,i);
                    i++;
                }
            }
            swap(array,start,i-1);

            System.out.println(Arrays.toString(array));
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
        int[]a1 = {6,2,3,7,1,5,9};
        partition(a1,0,a1.length);
        System.out.println(Arrays.toString(a1));
    }
}
