package main.leecode;

import java.util.LinkedList;
import java.util.List;

public class Solution_77 {

    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        helper(n, 1, k, new LinkedList<>(), 0);
        return  result;
    }

    public void helper(int n, int index, int k, List<Integer> temp, int depth){
        if(depth > k){
            return;
        }else if(depth == k){
            result.add(new LinkedList<>(temp));
        } else{
            for(int i = index; i <= n - (k - temp.size()) + 1; i ++){
                temp.add(i);
                helper(n, i + 1, k, temp, depth + 1);
                temp.remove(temp.size() - 1);
            }
        }

    }
}
