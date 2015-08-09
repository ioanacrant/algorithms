import java.io.*;
import java.util.*;
public class StrongConnectedComponents{
    public static int t=0;
    public static int s=0;
    public static int n=875714;
    public static boolean[] explored = new boolean[n+1];
    public static int[] finishingTimes = new int[n+1];
    public static int[] leaders = new int[n+1];



    public static void dFSLoop(ArrayList<ArrayList<Integer>> graph, int num){
        for (int i=n;i>0;i--){
            int trueInd;
            if (num==0){
                trueInd=i;
            }
            else{
                trueInd = finishingTimes[i];
            }
            if (explored[trueInd]==false){
                s = trueInd;
                dFS(graph, trueInd,num);
            }
        }
    }

    public static void dFS(ArrayList<ArrayList<Integer>> graph, int i, int num){
        explored[i]=true;
        // System.out.println(i);
        if (num==1){
            leaders[s]++;
        }

        for (int j=0; j<graph.get(i).size();j++){
            if (explored[graph.get(i).get(j)]==false){
                dFS(graph,graph.get(i).get(j), num);
            }
        }
        if (num==0){

            t++;
            finishingTimes[t]=i;
            //System.out.printf("%d, %d \n",t,i);
            //the index is the finishing time of node the value


        }

    }

    public static void main(String[] args) throws IOException{
        Scanner inf = new Scanner(new BufferedReader(new FileReader("StrongConnectedComponents.txt")));

        ArrayList<ArrayList<Integer>> adjacencyListForward = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<n+1;i++){
            adjacencyListForward.add(new ArrayList<Integer>());
        }
        ArrayList<ArrayList<Integer>> adjacencyListBackward = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<n+1;i++){
            adjacencyListBackward.add(new ArrayList<Integer>());
        }

        while (inf.hasNextLine()){
            String[] l = inf.nextLine().split(" ");
            adjacencyListForward.get(Integer.parseInt(l[0])).add(Integer.parseInt(l[1]));
            adjacencyListBackward.get(Integer.parseInt(l[1])).add(Integer.parseInt(l[0]));
        }


        for (int i=0; i<n+1;i++){
            explored[i]=false;
        }

        dFSLoop(adjacencyListBackward,0);

        for (int i=0; i<n+1;i++){
            explored[i]=false;
        }

        // System.out.println(Arrays.toString(finishingTimes));
        // System.out.println(adjacencyListBackward);
        //System.out.println(adjacencyListForward);
        dFSLoop(adjacencyListForward,1);
        System.out.println(Arrays.toString(leaders));


        int[] maxes = new int[5];
        int[] maxesi = new int[5];
        for(int i=0;i<5;i++){
            int maxn=0;
            int maxi=0;
            for (int j=0;j<leaders.length;j++){
                if (leaders[j]>maxn){
                    boolean flag=true;
                    for (int p=0;p<5;p++){
                        if (j==maxesi[p]){
                            flag=false;
                        }
                    }
                    if (flag){
                        maxn=leaders[j];
                        maxi=j;
                    }

                }
            }
            maxes[i]=maxn;
            maxesi[i]=maxi;
        }

        System.out.println(Arrays.toString(maxes));

    }

}
