import java.util.Random;
public class IthSmallestElement{
    public static int RSelect(int[] a, int start, int end, int iOrder){
        if (end - start == 0){
            return a[start];
        }
        Random rand = new Random();
        int pivotIndex = rand.nextInt((end-start)+1)+start;

        swap(a, start, pivotIndex);
        int pivot = a[start];
        int i=start+1;
        for (int j=start+1;j<end;j++){
            if (a[j]<pivot){
                swap(a,j,i);
                i++;
            }
        }
        swap(a,start,i-1);

        if (i == iOrder){
            return pivot;
        }
        else if (i > iOrder){
            return RSelect(a,start, i-2, iOrder);
        }
        else{
            return RSelect(a,i,end,iOrder-i+1);
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
        int[] hey = {2,8,10,3};
        System.out.println(RSelect(hey,0,hey.length,4));
    }
}
