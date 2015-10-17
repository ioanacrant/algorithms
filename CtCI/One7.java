import java.util.*;
public class One7{
    public static void setToZero(int[][] matrix){
        int m = matrix.length;
        int n = matrix[1].length;
        ArrayList<Integer> rows = new ArrayList<Integer>();
        ArrayList<Integer> cols = new ArrayList<Integer>();

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);

                }
            }
        }

        for (int x:rows){
            for (int i=0;i<n;i++){
                matrix[x][i]=0;
            }
        }
        for (int x:cols){
            for (int i=0;i<m;i++){
                matrix[i][x]=0;
            }
        }
    }
    public static void main(String[] args){
        int[][] a={{1,2,3},{4,0,6},{7,8,9}};
        setToZero(a);
        for (int[] n:a){
            System.out.print(Arrays.toString(n));
        }
    }
}
