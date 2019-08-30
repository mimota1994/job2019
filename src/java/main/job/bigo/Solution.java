package main.job.bigo;

import sun.reflect.generics.tree.Tree;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {
    static int min=Integer.MAX_VALUE;
    public static void main(String[] args){
        int []a={1,2};
        TreeNode r=contruct(a);
        System.out.println(run(r));
    }
    public static TreeNode contruct(int[] a){
        if(a.length<=0){
            return null;
        }
        TreeNode root=new TreeNode(a[0]);
        root.left=get(a,1);
        root.right=get(a,2);
        return root;
    }
    public static TreeNode get(int []a,int i){
        if(i>=a.length) return null;
        TreeNode r=new TreeNode(a[i]);
        r.left=get(a,i*2+1);
        r.right=get(a,i*2+1);
        return r;
    }
    public static int run(TreeNode root) {
       traver(root,0);
       if(min==Integer.MAX_VALUE){
           return 0;
       }
        return min;
    }
    public static void traver(TreeNode t, int count){

        if(t==null) return;
        int result=count+1;
        if(result>=min){
            return;
        }
        if(t.left==null && t.right==null){
            if(result<min){
                min=result;
                return;
            } else {
                return;
            }
        }
        if(t.left!=null){
            traver(t.left,result);
        }
        if(t.right!=null){
            traver(t.right,result);
        }
        return;
    }
}
