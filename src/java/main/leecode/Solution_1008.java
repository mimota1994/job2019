package main.leecode;

import java.util.Arrays;

public class Solution_1008 {

    public TreeNode bstFromPreorder(int[] preorder) {

        int[] inorder = preorder.clone();
        Arrays.sort(inorder);

        return createTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);

    }

    public TreeNode createTree(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight){
        if(preLeft > preRight || inLeft > inRight){
            return null;
        }else{
            int mid = inLeft;
            for(; mid < inRight; mid++){
                if(inorder[mid] == preorder[preLeft]){
                    break;
                }
            }

            TreeNode root = new TreeNode(preorder[preLeft]);
            root.left = createTree(preorder, preLeft + 1, preLeft + (mid - inLeft), inorder, inLeft, mid - 1);
            root.right = createTree(preorder, preLeft + (mid - inLeft) + 1, preRight, inorder, mid + 1, inRight);
            return root;
        }
    }
}
