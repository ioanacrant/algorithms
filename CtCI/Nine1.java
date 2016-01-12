class Nine1{
    public static void main(String[] args){
        System.out.print(countWays(5));
    }
    public static int countWays(int n){
        int[] ways = new int[n+1];
        ways[0]=1;
        ways[1]=1;
        ways[2]=2;
        ways[3]=4;
        for (int i=4;i<ways.length;i++){
            ways[i]=ways[i-1]+ways[i-2]+ways[i-3];
        }
        return ways[n];
    }
}
