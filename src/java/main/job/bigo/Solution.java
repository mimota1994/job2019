package main.job.bigo;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {
    int min=Integer.MAX_VALUE;
    public int run(TreeNode root) {
       traver(root,0);
        return min;
    }
    public void traver(TreeNode t, int count){
        if(t==null) return;
        if(t.left!=null){
            traver(t.left,count+1);
        }
        if(t.right!=null){
            traver(t.right,count+1);
        }
        return;
    }
}
