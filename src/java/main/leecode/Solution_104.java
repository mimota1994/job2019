package main.leecode;

public class Solution_104 {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            return left > right ? left + 1 : right + 1;
        }
    }
}


