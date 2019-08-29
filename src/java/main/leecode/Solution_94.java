package main.leecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }else{
            List<Integer> left = inorderTraversal(root.left);
            List<Integer> right = inorderTraversal(root.right);
            left.add(root.val);
            left.addAll(right);
            return left;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root, boolean flag) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(root != null || !stack.isEmpty()){
           while(root != null){
               stack.push(root);
               root = root.left;
           }
           if(!stack.isEmpty()){
               root = stack.pop();
               list.add(root.val);
               root = root.right;
           }
        }
        return list;
    }
}


