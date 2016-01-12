class Four6{
    public Node findInOrderSuccessor(Node n){
        if (n.right!=null){
            return findSmallest(n.right);
        }
        else{
            return findRightParent(n);
        }
    }
    public Node findSmallest(Node n){
        if (n.left==null){
            return n;
        }
        return findSmallest(n.left);
    }

    public Node findRightParent(Node n){
        if (n.parent.left==n){
            return n.parent;
        }
        return findRightParent(n.parent);
    }
}
class Node{
    int value;
    Node left;
    Node right;
    Node parent;
    Node(int v){
        value = v;
    }
}
