package main.leecode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 先找到中间越变的点
 * 然后根根据情况左边或者右边查找
 */

public class Solution_33 {

    public void visit(TreeNode node){
        LinkedList list = new LinkedList();
        Stack<TreeNode> stack = new Stack();

        while(node != null || !stack.isEmpty()){
            while(node != null){
                stack.add(node);
                node = node.left;
            }

            node = stack.pop();
            list.add(node.val);
            node = node.right;
        }
    }

    public void visit(TreeNode node, boolean pre){
        LinkedList list = new LinkedList();
        Stack<TreeNode> stack = new Stack();

        while(node != null || !stack.isEmpty()){
            if(node != null){
                list.add(node);
            }
            while(node != null){
                stack.add(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
    }
}
