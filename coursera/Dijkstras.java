import java.util.*;
import java.io.*;
public class Dijkstras{

    public static void main(String[] args) throws IOException{
        Scanner inf = new Scanner(new BufferedReader(new FileReader("coursera/dijkstrastest.txt")));

        ArrayList<ArrayList<ArrayList<Integer>>> adjacencyList = new ArrayList<ArrayList<ArrayList<Integer>>>();
        adjacencyList.add(new ArrayList<ArrayList<Integer>>());

        int count=0;
        while (inf.hasNextLine()){
            count+=1;
            ArrayList<ArrayList<Integer>> weightedEdges = new ArrayList<ArrayList<Integer>>();
            String[] line = inf.nextLine().split(" ");
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

        ArrayList<Integer> processedVertices = new ArrayList<Integer>();
        int[] shortestPathDistances = new int[count+1];
        Arrays.fill(shortestPathDistances,1000000);
        shortestPathDistances[1]=0;

        System.out.println(Arrays.toString(shortestPathDistances));

    }
}
