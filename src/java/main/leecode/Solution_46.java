package main.leecode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_46 {

    List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        Solution_46 s = new Solution_46();
        s.permute(new int[]{1,2,3});
        System.out.println();
    }

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }
        permute(list, 0);
        return result;
    }

    public void permute(List<Integer> nums, int index) {
        if(index == nums.size()){
            result.add(new ArrayList<>(nums));
            return;
        }else{
            for(int i = index; i < nums.size(); i++){
                Collections.swap(nums, index, i);
                permute(nums, index + 1);
                Collections.swap(nums, index, i);
            }
        }

    }
}
