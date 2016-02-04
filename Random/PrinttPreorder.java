public class PrinttPreorder{
    public static void main(String[] args){
        Node h = new Node(5);
        h.left = new Node(3);
        h.right = new Node(6);
        printPreOrder(h);
    }
    public static void printPreOrder(Node root){
        if (root!=null){
            printPreOrder(root.left);
            System.out.print(""+root.value);
            printPreOrder(root.right);
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
