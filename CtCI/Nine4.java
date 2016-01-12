import java.util.*;
class Nine4{
    public static void main(String[] args){
        int[] a = {1,2,3};
        System.out.print(subsets(a));
    }
    public static ArrayList<ArrayList<Integer>> subsets(int[] set){
        if (set.length == 1){
            ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
            r.add(new ArrayList<Integer>());
            r.add(new ArrayList<Integer>());
            r.get(1).add(set[0]);
            return r;
        }
        else{
            return addToAll(set[set.length-1], subsets(Arrays.copyOfRange(set,0,set.length-1)));
        }
    }
    public static ArrayList<ArrayList<Integer>> addToAll(int x, ArrayList<ArrayList<Integer>> before){
        int beforeSize = before.size();
        System.out.println(before);
        for (int i=0;i<beforeSize;i++){
            ArrayList<Integer> newa = new ArrayList<Integer>(before.get(i));
            newa.add(x);
            before.add(newa);
        }
        return before;
    }
}
