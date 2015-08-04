import java.util.Arrays;
public class Mergesort{
  public static int[] merge(int[]a, int[]b){
    int i=0;
    int j=0;
    int[] mergedArray=new int[a.length+b.length];
    for (int k=0;k<mergedArray.length;k++){
      if (j==b.length){
        mergedArray[k]=a[i];
        i++;
      }
      else if(i==a.length){
        mergedArray[k]=b[j];
        j++;
      }
      else if (a[i]<b[j]){
        mergedArray[k]=a[i];
        i++;
      }
      else{
        mergedArray[k]=b[j];
        j++;
      }
    }
    return mergedArray;
  }
  public static int[] split(int[] orig){
    if (orig.length==0 || orig.length==1){
      return orig;
    }
    int[] a=new int[orig.length/2];
    System.arraycopy(orig,0,a,0,a.length);
    int[] b=new int[orig.length-orig.length/2];
    System.arraycopy(orig,a.length,b,0,b.length);
    return merge(split(a),split(b));
  }
  public static void main(String[] args){
    int[] orig= {2,5,3,3,8,1,7,4,9,6};
    System.out.println(Arrays.toString(split(orig)));

  }
}
