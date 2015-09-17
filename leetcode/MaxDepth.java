public class MaxDepth{
    public static int maxDepth(TreeNode root){
        if (root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.right), maxDepth(root.left));
    }
    public static void main(String[] args){
        TreeNode n = new TreeNode(1);
        n.left = new TreeNode(2);
        n.right = new TreeNode(3);
        n.right.right = new TreeNode(4);

        System.out.print(maxDepth(n));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
