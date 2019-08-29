package main.leecode;

import sun.reflect.generics.tree.Tree;

public class Solution_105 {

    public static void main(String[] args) {
        Solution_105 s = new Solution_105();
        Object o = s.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
        System.out.println();
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight) {
        if(preLeft > preRight || inLeft > inRight){
            return null;
        }else{
            int i = inLeft;
            for(; i <= inRight; i++){
                if(inorder[i] == preorder[preLeft]){
                    break;
                }
            }
            TreeNode node = new TreeNode(preorder[preLeft]);
            TreeNode left = buildTree(preorder, preLeft + 1, preLeft + i - inLeft, inorder, inLeft, i - 1);
            TreeNode right = buildTree(preorder, preLeft + 1 + i - inLeft, preRight, inorder, i + 1, inRight);
            node.left = left;
            node.right = right;

            return node;
        }
    }
}
