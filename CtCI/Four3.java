class Four3{
    public static Node createBinaryTree(int[] array, int start, int end){
        if (end==start){
            return null;
        }
        Node root = new Node(array[start+ (end-start)/2]);
        root.left = createBinaryTree(array, start, start+ (end-start)/2);
        root.right=createBinaryTree(array, start+ (end-start)/2 +1,end);
        return root;

    }
    public static void main(String[] args){
        int[] a = {2,3,4,5};

        Node n=createBinaryTree(a, 0, a.length);
        System.out.print(n.left.left.value);
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
