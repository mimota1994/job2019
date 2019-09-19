package main.leecode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution_40 {

    public static void main(String[] args) {
        Solution_40 s = new Solution_40();
        s.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
    }
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates, 0, target, new LinkedList<>());
        return result;
    }

    public void helper(int[] candidates, int index, int target, List<Integer> temp){
        if(target < 0){
            return;
        }else if(target == 0){
            result.add(new LinkedList<Integer>(temp));
        }else{
            for(int i = index; i < candidates.length && target - candidates[i] >= 0; i ++){
                if(i > index && candidates[i] == candidates[i - 1]){
                    continue;
                }
                temp.add(candidates[i]);
                helper(candidates, i + 1, target - candidates[i], temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
