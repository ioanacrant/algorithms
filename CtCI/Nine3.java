class Nine3{
    public static void main(String[] args){
        int[] a = {-1,0,1,3,6,7,8,9,10,11,20};
        System.out.print(magicIndex(a));
    }
    public static int magicIndex(int[] array){
        return magicIndex(array, 0, array.length);
    }
    public static int magicIndex(int[] array, int start, int end){
        if (end<start){
            return -1;
        }
        if (start+ (end-start)/2 == array[start+ (end-start)/2]){
            return start+ (end-start)/2;
        }
        else if (start+ (end-start)/2 < array[start+ (end-start)/2]){
            return magicIndex(array, start, start+ (end-start)/2);
        }
        else{
            return magicIndex(array, start+ (end-start)/2+1, end);
        }
    }
}
