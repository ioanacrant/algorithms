import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Random;

public class RandomMinCut{

    public static ArrayList<ArrayList<Integer>> contract(ArrayList<ArrayList<Integer>> array, int a, int b){
        for (int i=0;i<array.size();i++){
            if (i!=a){
                for (int j=0;j<array.get(i).size();j++){
                    if (array.get(i).get(j)==b){
                        array.get(i).set(j,a);

                    }
                }
            }
        }

        for (int i=0;i<array.get(b).size();i++){
            if (array.get(b).get(i) !=a){
                int yay = array.get(b).get(i);
                array.get(a).add(yay);
            }
        }
        array.get(b).clear();

        while (array.get(a).remove((Integer) b)){

        }

        return array;

    }
    public static void main(String[] args) throws IOException{
        Scanner br = new Scanner(new BufferedReader(new FileReader("RandomMinCut.txt")));
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();
        adjacencyList.add(new ArrayList<Integer>());
        while (br.hasNextLine()){
            String[] hello = br.nextLine().split(" ");
            ArrayList<Integer> line = new ArrayList<Integer>();
            for (int j=1;j<hello.length;j++){
                line.add(Integer.parseInt(hello[j]));
            }
            adjacencyList.add(line);
        }
        br.close();
        //System.out.println(adjacencyList);
        int count = 0;
        while(count<adjacencyList.size()-3){
            Random rand = new Random();
            int v = rand.nextInt(adjacencyList.size());

            if (!adjacencyList.get(v).isEmpty()){
                count++;
                int re = rand.nextInt(adjacencyList.get(v).size());
                int e = adjacencyList.get(v).get(re);
                adjacencyList=contract(adjacencyList,v,e);
                //System.out.printf("%d, %d",v,e);

            }

        }
        System.out.println(adjacencyList);
        for (ArrayList<Integer> a:adjacencyList){
            if (!a.isEmpty()){
                System.out.println(a.size());
            }
        }



    }
}
