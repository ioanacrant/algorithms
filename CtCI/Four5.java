import java.util.*;
class Four5{
    public boolean checkIfBinary(Node root){
        ArrayList<Integer> empty = new ArrayList<Integer>();
        ArrayList<Integer> a = convertToList(root, empty);
        ArrayList<Integer> b = a;
        Collections.sort(a);
        return b.equals( a);

    }
    public ArrayList<Integer> convertToList(Node root, ArrayList<Integer> inOrder){
        inOrder.addAll(convertToList(root.left, inOrder));
        inOrder.add(root.value);
        inOrder.addAll(convertToList(root.right, inOrder));
        return inOrder;
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
