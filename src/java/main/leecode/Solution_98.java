package main.leecode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution_98 {

    public List<Integer> list = new LinkedList<>();

    public boolean isValidBST(TreeNode root) {

//        helper(root);
//        for(int i = 0; i < list.size() - 1; i++){
//            if(list.get(i) >= list.get(i + 1)){
//                return false;
//            }
//        }
//
//        return true;

        return mid(root);

    }

    public void helper(TreeNode root){
        if(root == null){
            return;
        }else{
            helper(root.left);
            list.add(root.val);
            helper(root.right);
        }
    }

    public boolean mid(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        Integer pre = null;
        Integer cur = null;

        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.add(root);
                root = root.left;
            }
            root = stack.pop();
            if(root != null){
                pre = cur;
                cur = root.val;
                if(pre != null && pre >= cur){
                    return false;
                }
                root = root.right;
            }
        }
        return true;
    }
}
