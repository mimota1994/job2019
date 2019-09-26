package main.leecode;

public class Solution_121 {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        if(n <= 0){
            return 0;
        }

        int preMin = prices[0];
        int max = 0;
        for(int i = 1; i < n; i++){
            int p = prices[i] - preMin;
            preMin = preMin < prices[i] ? preMin : prices[i];
            if(p > max){
                max = p;
            }
        }
        return max;

    }
}
