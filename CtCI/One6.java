import java.util.*;
public class One6{
    public static void rotate(int[][]grid){
        int n = grid.length;
        for (int x=0; x<(int)n/2+x%2;x++){
            for (int y=0; y<(int)n/2;y++){
                System.out.print("h");
                swap(grid, n, x, y);
            }
        }
    }
    public static void swap(int[][] grid, int n, int x, int y){
        int s = grid[y][n-x-1];
        grid[y][n-x-1] = grid[x][y];
        grid[x][y]=grid[n-y-1][x];
        grid[n-y-1][x] = grid[n-x-1][n-y-1];
        grid[n-x-1][n-y-1] = s;
    }
    public static void main(String[]args){
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};

        rotate(a);
        for (int[] n:a){
            System.out.print(Arrays.toString(n));
        }

    }
}
