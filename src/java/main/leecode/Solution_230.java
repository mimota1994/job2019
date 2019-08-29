package main.leecode;

public class Solution_230 {
    public int kthSmallest(TreeNode root, int k) {
        if(root.left == null && k == 1){
            return root.val;
        } else{
            int a = kHelper(root.left);
            if(a >= k){
                return kthSmallest(root.left, k);
            }else if(a == k - 1){
                return root.val;
            }else{
                return kthSmallest(root.right, k - (a + 1));
            }
        }
    }

    public int kHelper(TreeNode root){
        if(root == null){
            return 0;
        }else{
            int a = kHelper(root.left);
            int b = kHelper(root.right);
            return a + b + 1;
        }
    }
}
