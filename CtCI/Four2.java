import java.util.*;
class Four2{
    public boolean checkIfConnected(Node a, Node b){
        Queue<Node> bfsQueue = new LinkedList<Node>();
        bfsQueue.add(a);
        while (!bfsQueue.isEmpty()){
            Node current = bfsQueue.remove();
            if (!current.visited){
                if (current==b){
                    return true;
                }
                for (Node n: current.adjacent){
                    bfsQueue.add(n);
                }
                current.visited=true;
            }
        }
        return false;
    }
}

class Node{
    boolean visited;
    int value;
    ArrayList<Node> adjacent;

    Node(int v){
        value=v;
        visited=false;
    }
    public void goesTo(Node b){
        adjacent.add(b);
    }
}
