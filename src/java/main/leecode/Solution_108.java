package main.leecode;

public class Solution_108 {

    public TreeNode sortedArrayToBST(int[] nums) {

        return helper(nums, 0, nums.length - 1);

    }

    public TreeNode helper(int[] nums, int start, int end){
        if(start > end){
            return null;
        }else{
            int index = (start + end) / 2;
            TreeNode node = new TreeNode(nums[index]);
            node.left = helper(nums, start, index - 1);
            node.right = helper(nums, index + 1, end);
            return node;
        }
    }
}
