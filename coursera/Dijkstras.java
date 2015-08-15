import java.util.*;
import java.io.*;
public class Dijkstras{

    public static void main(String[] args) throws IOException{
        Scanner inf = new Scanner(new BufferedReader(new FileReader("coursera/dijkstraData.txt")));

        ArrayList<ArrayList<ArrayList<Integer>>> adjacencyList = new ArrayList<ArrayList<ArrayList<Integer>>>();
        adjacencyList.add(new ArrayList<ArrayList<Integer>>());

        int count=0;
        while (inf.hasNextLine()){
            count+=1;
            ArrayList<ArrayList<Integer>> weightedEdges = new ArrayList<ArrayList<Integer>>();
            String[] line = inf.nextLine().split("\t");
            for (int i =1; i<line.length;i++){
                ArrayList<Integer> edge = new ArrayList<Integer>();
                String[] pair= line[i].split(",");
                edge.add(Integer.parseInt(pair[0]));
                edge.add(Integer.parseInt(pair[1]));
                //System.out.println(edge);
                weightedEdges.add(edge);
            }
            adjacencyList.add(weightedEdges);
        }
        System.out.println(adjacencyList);
        ArrayList<Integer> processedVertices = new ArrayList<Integer>();
        int[] shortestPathDistances = new int[count+1];
        Arrays.fill(shortestPathDistances,1000000);
        shortestPathDistances[1]=0;

        processedVertices.add(1);
        while (processedVertices.size()<count){
            int lowestGreedyScore = 1000000000;
            int lowestOutsideEdge=-1;
            // System.out.println(processedVertices);
            for (int n:processedVertices){
                // System.out.println(n);
                ArrayList<ArrayList<Integer>> edgesFromN = adjacencyList.get(n);
                // System.out.println(edgesFromN);
                for (ArrayList<Integer> edgePair: edgesFromN){
                    // System.out.print("h");
                    // System.out.println(edgePair);
                    if (!processedVertices.contains(edgePair.get(0) )){
                        int computedScore = shortestPathDistances[n] + edgePair.get(1);
                        if (computedScore<lowestGreedyScore){
                            lowestGreedyScore = computedScore;
                            lowestOutsideEdge = edgePair.get(0);
                        }
                        // System.out.println(lowestGreedyScore);
                    }
                }
            }

            processedVertices.add(lowestOutsideEdge);
            shortestPathDistances[lowestOutsideEdge] = lowestGreedyScore;

        }
        System.out.print(Arrays.toString(shortestPathDistances));
        int[] cool = {7,37,59,82,99,115,133,165,188,197};
        for (int c:cool){
            System.out.printf("%d,",shortestPathDistances[c]);
        }
    }
}
