package main.leecode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution_102 {

    public List<List<Integer>> levelOrder(TreeNode root) {


        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        TreeNode end = root;
        TreeNode nextEnd = null;

        List<Integer> list = new ArrayList<>();
        List<List<Integer>> toatlList = new ArrayList<>();

        if(root == null){
            return toatlList;
        }

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left != null){
                queue.add(node.left);
                nextEnd = node.left;
            }

            if(node.right != null){
                queue.add(node.right);
                nextEnd = node.right;
            }

            if(node == end){
                toatlList.add(new ArrayList<>(list));
                list.clear();
                end = nextEnd;
            }
        }

        return toatlList;
    }
}
