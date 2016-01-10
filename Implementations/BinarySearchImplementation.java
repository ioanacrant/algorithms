class Solution{
    public static int binarySearch(int[] array, int start, int end, int n){
        if (start>end){
            return -1;
        }
        int median = start+(end-start)/2;
        if (array[median]==n){
            return median;
        }
        else if (array[median]<n){
            return binarySearch(array, median+1, end, n);
        }
        else{
            return binarySearch(array, start, median-1, n);
        }
    }
}
