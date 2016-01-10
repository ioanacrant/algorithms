import java.util.*;
public class SortingImplementation{
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 8};
        System.out.print(binarySearch(a, 0, a.length, 4));
        //quickSort(a);
        System.out.print(Arrays.toString(a));
    }
    public static void bubbleSort(int[] array){
        while (true){
            boolean isSorted = true;
            for (int i=0;i<array.length-1;i++){
                if (array[i]>array[i+1]){
                    swap(array, i, i+1);
                    isSorted=false;
                }
            }
            if (isSorted){
                break;
            }
        }
    }
    public static void swap(int[] array, int i1, int i2){
        int holder = array[i1];
        array[i1]=array[i2];
        array[i2]=holder;
    }

    public static void selectionSort(int[] array){
        for (int i=0;i<array.length;i++){
            int smallestIndex =i;
            for (int j=i;j<array.length;j++){
                if (array[j]<array[smallestIndex]){
                    smallestIndex = j;
                }
            }
            swap(array, i, smallestIndex);
        }
    }
    public static int[] mergeSort(int[] array){
        if (array.length<=1){
            return array;
        }
        int[] a1 = new int[array.length/2];
        int[] a2 = new int[array.length-array.length/2];
        for (int i=0;i<array.length/2;i++){
            a1[i]=array[i];
        }
        for (int i=array.length/2;i<array.length;i++){
            a2[i-array.length/2]=array[i];
        }
        //System.out.print(Arrays.toString(a1));
        return merge(mergeSort(a1), mergeSort(a2));
    }
    public static int[] merge(int[] a1, int[] a2){
        int i=0;
        int j=0;
        int k =0;
        int[] merged = new int[a1.length+a2.length];
        while (k<(a1.length+a2.length)){
            if (i==a1.length){
                merged[k]=a2[j];
                j++;
                k++;
            }
            else if (j==a2.length){
                merged[k] = a1[i];
                i++;
                k++;
            }
            else if (a1[i]<=a2[j]){
                merged[k]=a1[i];
                i++;
                k++;
            }
            else{
                merged[k]=a2[j];
                j++;
                k++;
            }
        }
        //System.out.print(Arrays.toString(merged));
        return merged;
    }

    public static void quickSort(int[] array){
        partition(array, 0, array.length);
    }
    public static void partition(int[]array, int start, int end){
        if(start>=0 && end<=array.length && end>start+1){
            int pivot = array[start];
            int placeHolder = 1+start;
            for (int i=start+1;i<end;i++){
                if (array[i]<pivot){
                    swap(array, placeHolder, i);
                    placeHolder++;
                }
            }
            swap(array, start, placeHolder-1);
            partition(array, 0, placeHolder-2);
            partition(array, 0, placeHolder);
        }

    }

}
