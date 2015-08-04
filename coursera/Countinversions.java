import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Countinversions{
  public static long mergeAndSort(long[]a, long[]b, long[]result){
    int i=0;
    int j=0;
    long count=0;
    for (int k=0;k<result.length;k++){
      if (j==b.length){
        result[k]=a[i];
        i++;
      }
      else if(i==a.length){
        result[k]=b[j];
        j++;
      }
      else if (a[i]<b[j]){
        result[k]=a[i];
        i++;
      }
      else{
        result[k]=b[j];
        count += a.length-i;
        j++;
      }
    }
    return count;
  }
  public static long countInversions(long[] orig){
    if (orig.length<=1){
      return 0;
    }
    long[] a=new long[orig.length/2];
    System.arraycopy(orig,0,a,0,a.length);
    long[] b=new long[orig.length-orig.length/2];
    System.arraycopy(orig,a.length,b,0,b.length);
    long countLeft=countInversions(a);
    long countRight=countInversions(b);

    long[] result=new long[orig.length];
    long countMerge=mergeAndSort(a,b,result);

    for (int i=0;i<result.length;i++){
      orig[i]=result[i];
    }

    return countLeft+countRight+countMerge;
  }
  public static void main(String[] args){
    BufferedReader br=null;
    try{
      br = new Scanner(new BufferedReader(new FileReader("CountInversions.txt")));
      long[] orig=new long[10];
      while (br.hasNextLine()){
        orig[i]=Long.parseLong(br.readLine());
      }
      System.out.println(countInversions(orig));
    }
    catch (IOException e){
      e.printStackTrace();
    }

  }
}
