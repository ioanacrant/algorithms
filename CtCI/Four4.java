import java.util.*;
class Four4{
    public ArrayList<LinkedList<Node>> nodesAtDepths(Node root){
        ArrayList<LinkedList<Node>> depths = new ArrayList<LinkedList<Node>>();
        LinkedList<Node> first = new LinkedList<Node>();
        first.add(root);
        depths.add(first);
        while (true){
            LinkedList<Node> currentDepth = new LinkedList<Node>();
            LinkedList<Node> beforeDepth = depths.get(depths.size()-1);
            for (Node n:beforeDepth){
                if (n.left!=null){
                    currentDepth.add(n.left);
                }
                if (n.right!=null){
                    currentDepth.add(n.right);
                }
            }
            if (currentDepth.isEmpty()){
                return depths;
            }
            depths.add(currentDepth);
        }
    }
}
class Node{
    int value;
    Node left;
    Node right;
    Node(int v){
        value = v;
    }
}
