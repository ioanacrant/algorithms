class BNode{
    int value;
    BNode left;
    BNode right;

    BNode(int v){
        value=v;
        left=null;
        right=null;
    }
}
class BinarySearchTree{
    BNode root;

    BinarySearchTree(BNode r){
        root=r;
    }

    void add(int n){
        Node current = root;
        while (current!=null){
            if (current.value<n){
                current = current.right;
            }
            else{
                current = current.left;
            }
        }
        current = new BNode(n);
    }
    
}
