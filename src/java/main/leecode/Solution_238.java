package main.leecode;

public class Solution_238 {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        dp[0] = 1;
        for(int i = 1; i < n; i++){
            dp[i] = nums[i - 1] * dp[i - 1];
        }

        int k = 1;
        for(int i = n - 2; i >= 0; i--){
            dp[i] *= k;
            k = k * nums[i];
        }

        return dp;
    }
}
