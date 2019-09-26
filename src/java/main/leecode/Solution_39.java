package main.leecode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution_39 {

    public static void main(String[] args) {
        Solution_39 s = new Solution_39();
        s.combinationSum(new int[]{2,3,5,7}, 7);
    }

    List<List<Integer>> totalList = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates, 0, target, new LinkedList<>());
        return totalList;
    }

    public void helper(int[] candidates, int index, int target, List<Integer> tmp){
        if(index >= candidates.length || target < 0){
            return;
        }else if(target == 0){
            totalList.add(new LinkedList<>(tmp));
        }else{
            for(int i = index; i < candidates.length && target >= 0; i++){
                tmp.add(candidates[i]);
                helper(candidates, i, target - candidates[i], tmp);
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}
