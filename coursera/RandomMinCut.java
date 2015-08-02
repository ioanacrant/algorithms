import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class RandomMinCut{

    public static void main(String[] args) throws IOException{
        System.out.println("hrloo");
        Scanner br = new Scanner(new BufferedReader(new FileReader("hello.txt")));
        System.out.println(br.nextLine());
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<200; i++){
            List<String> line = new ArrayList<String>(Arrays.asList(br.nextLine().split(" ")));
            //line.remove(0);
            //adjacencyList.add(line);
        }
        System.out.println(adjacencyList);
        br.close();
    }
}
