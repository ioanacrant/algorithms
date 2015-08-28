import java.util.*;
import java.io.*;

public class MedianMaintenance{
    public static int extractMedian(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap){
        if (minHeap.size()-maxHeap.size()>=2){
            maxHeap.add(minHeap.poll());
        }
        else if (maxHeap.size()-minHeap.size()>=2){
            minHeap.add(maxHeap.poll());
        }

        if (minHeap.size()==maxHeap.size()){
            return minHeap.peek();
        }
        else{
            if (minHeap.size()>maxHeap.size()){
                return minHeap.peek();
            }
            else{
                return maxHeap.peek();
            }
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner inf = new Scanner(new BufferedReader(new FileReader("coursera/Medianmaintenance.txt")));

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(10, Collections.reverseOrder());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>();

        int totsum = 0;

        while (inf.hasNextLine()){
            int num = Integer.parseInt(inf.nextLine());

            if (minHeap.size()==0 && maxHeap.size()==0){
                minHeap.add(num);
            }
            else if (minHeap.size()==0){
                if (num<=maxHeap.peek()){
                    minHeap.add(num);
                }
                else{
                    maxHeap.add(num);
                }
            }
            else if (maxHeap.size()==0){
                if (num<=minHeap.peek()){
                    minHeap.add(num);
                }
                else{
                    maxHeap.add(num);
                }
            }
            else{
                if (num<=maxHeap.peek()){
                    minHeap.add(num);
                }
                else{
                    maxHeap.add(num);
                }
            }

            int m = extractMedian(minHeap, maxHeap);
            // System.out.println(m);
            totsum+=m;


        }
        System.out.print(totsum);

    }
}
