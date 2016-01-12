class Nine2{
    public static void main(String[] args){
        System.out.print(countPaths(2,2));
    }
    public static int countPaths(int x, int y){
        int[][] paths = new int[y+1][x+1];
        paths[0][0] = 1;
        for (int i=0;i<y+1;i++){
            for (int j=0;j<x+1;j++){
                if (!(i==0 && j==0)){
                    if (i==0){
                        paths[i][j]=paths[i][j-1];
                    }
                    else if (j==0){
                        paths[i][j]=paths[i-1][j];
                    }
                    else{
                        paths[i][j]=paths[i-1][j]+paths[i][j-1];
                    }
                }
            }
        }
        return paths[y][x];
    }
}
