package main.leecode;

public class Solution_5 {

    public static void main(String[] args) {
        Solution_5 s= new Solution_5();
        System.out.println(s.longestPalindrome("ccc"));
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        String maxStr = "";
        for(int i = 0; i < n; i++){
            dp[i][i] = 1;
            if(maxStr.length() < 1){
                maxStr = s.substring(i, i+ 1);
            }
            if(i + 1 < n && s.charAt(i) == s.charAt(i + 1)){
                dp[i][i + 1] = 1;
                if(maxStr.length() < 2){
                    maxStr = s.substring(i, i + 1 + 1);
                }
            }
        }

        for(int len = 3; len < n; len++){
            for(int i = 0; i + len - 1 < n; i++){
                int end = i + len - 1;
                if(s.charAt(i) == s.charAt(end)){
                    dp[i][end] = dp[i + 1][end - 1];
                    if(dp[i][end] == 1 && maxStr.length() < len){
                        maxStr = s.substring(i, end + 1);
                    }
                }
            }
        }

        return maxStr;
    }

    public int myAtoi(String str) {

        char head = str.charAt(0);
        int result = 0;
        if(head == '-' || head == '+' || (head - '0' >= 0 && head - '0' <= 9)){
            int i = 0;
            if(head == '-'|| head == '+'){
                i ++;
            }
            for(;i < str.length(); i++){
                if(str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 9){
                    result = result * 10 + str.charAt(i) - '0';
                }
            }

        }else{
            return 0;
        }

        return 1;
    }

}
