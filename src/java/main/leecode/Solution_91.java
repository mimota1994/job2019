package main.leecode;

public class Solution_91 {

    public static void main(String[] args) {
        Solution_91 s = new Solution_91();
        s.numDecodings("123");
    }

    public int numDecodings(String s) {
        int n = s.length();
        if(n <= 0){
            return 0;
        }
        int[] dp = new int[n];
        if(s.charAt(0) == '0'){
            return 0;
        }

        dp[0] = 1;
        for(int i = 1; i < n; i++){
            int a = (s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0');
            int b = (s.charAt(i) - '0');
            if(b > 0){
                dp[i] += dp[i - 1];
            }
            if(a > 0 && a <= 26 && s.charAt(i - 1) != '0'){
                if(i - 2 >= 0){
                    dp[i] += dp[i - 2];
                }else{
                    dp[i] += 1;
                }
            }

        }
        return dp[n - 1];
    }
}
