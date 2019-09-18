package main.leecode;

public class Solution_45 {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        for(int i = 0; i < n; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        int index = 0;
        for(int i = 0; i < n; i++){
            int k = nums[i];
            for(int j = index + 1; j <= (i + k); j++){
                if(j >= n){
                    return dp[n - 1];
                }else{
                    dp[j] = Math.min(dp[j], dp[i] + 1);
                    if(j == n - 1){
                        return dp[n - 1];
                    }
                }
            }
            index = (i + k);
        }
        return dp[n - 1];
    }
}
