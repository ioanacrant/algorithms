public class SameTree{
    public static boolean isSameTree(TreeNode p, TreeNode q){
        if (p==null && q==null){
            return true;
        }
        else if (p==null || q ==null){
            return false;
        }
        if (p.val!=q.val){
            return false;
        }
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }


}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
