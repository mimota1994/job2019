package main.leecode;

import java.util.ArrayList;
import java.util.List;

public class Solution_118 {

    public static void main(String[] args) {
        Solution_118 s = new Solution_118();
        s.generate(3);
        System.out.println();
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> totalList = new ArrayList<>();

        if(numRows <= 0){
            return totalList;
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        totalList.add(list);

        int n = 1;
        while(n < numRows){
            n ++;
            List<Integer> tmp = new ArrayList<>();
            for(int i = 0; i < n; i++){
                if(i == 0 || i == n - 1){
                    tmp.add(1);
                }else {
                    tmp.add(totalList.get(n - 2).get(i - 1) + totalList.get(n - 2).get(i));
                }
            }
            totalList.add(tmp);
        }
        return totalList;
    }
}
