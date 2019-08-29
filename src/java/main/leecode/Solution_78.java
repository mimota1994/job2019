package main.leecode;

import java.util.ArrayList;
import java.util.List;

public class Solution_78 {

    List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        Solution_78 s = new Solution_78();
        s.subsets(new int[]{1,2,3,4});
        System.out.println();
    }

    public List<List<Integer>> subsets(int[] nums) {
        subsetsHelper(nums, 0, new ArrayList<>());
        return result;
    }

    public void subsetsHelper(int[] nums, int index, List<Integer> tmp) {
       if(index >= nums.length){
           result.add(new ArrayList<>(tmp));
           return;
       }else{
           subsetsHelper(nums, index + 1, tmp);
           tmp.add(nums[index]);
           subsetsHelper(nums, index + 1, tmp);
//           tmp.remove(tmp.size() - 1);
       }

    }


}
