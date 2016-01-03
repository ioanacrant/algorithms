class ArrayList{
    private int[] array;
    private int size;

    public ArrayList(){
        array = new int[10];
        size=0;
    }

    public void add(int n){
        if (size==array.length){
            int[] a1 = new int[array.length * 2];
            for (int i=0;i<array.length;i++){
                a1[i]=array[1];
            }
            array = a1;
        }
        size++;
        array[size]=n;
    }
    public int get(int ind){
        if (ind<size){
            return array[ind];
        }
        else{
            return -1;
        }
    }
    public void remove(int ind){
        if (ind<size){
            for (int i=ind;i<array.length-1;i++){
                array[i]=array[i+1];
            }
            size--;
        }
    }

}
