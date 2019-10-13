package main.leecode;

public class Solution_572 {


    public boolean isSubtree(TreeNode s, TreeNode t, TreeNode tRoot) {
        if(s == null && t == null){
            return true;
        }else if(s != null && t != null){
            if(s.val == t.val) {
                return (isSubtree(s.left, t.left, tRoot) && isSubtree(s.right, t.right, tRoot)) || (isSubtree(s.left, tRoot, tRoot) || isSubtree(s.right, tRoot, tRoot));
            }else{
                return isSubtree(s.left, tRoot, tRoot) || isSubtree(s.right, tRoot, tRoot);
            }
        }else{
            return false;
        }
    }
}
