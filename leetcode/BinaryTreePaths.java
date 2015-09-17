import java.util.*;
public class BinaryTreePaths{

    public static List<String> findPaths(TreeNode treenode, List<Integer> path, List<String> allPaths){
        if (treenode!=null){
            path.add(treenode.val);
            if (treenode.right==null && treenode.left==null){
                allPaths.add(arrowFormat(path));
            }
            else{
                findPaths(treenode.right, new ArrayList(path), allPaths);
                findPaths(treenode.left, new ArrayList(path), allPaths);
            }

        }
        return allPaths;
    }

    public static String arrowFormat(List<Integer> path){
        String s="";
        for (Integer i: path){
            s+=Integer.toString(i);
            s+="->";
        }
        return s.substring(0,s.length()-2);
    }

    public static void main(String[] args){
        TreeNode n = new TreeNode(1);
        n.left = new TreeNode(2);
        n.right = new TreeNode(3);
        n.right.right = new TreeNode(4);
        System.out.print(findPaths(n, new ArrayList<Integer>(), new ArrayList<String>()));


    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
