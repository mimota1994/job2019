package main.job.donfancaifu2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        String s1 = strs[0];
        String s2 = strs[1];
        String s3 = strs[2];

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        for(int i = 0; i < s1.length() + 1; i++){
            for(int j = 0; j < s2.length() + 1; j ++){
                if(i == 0 && j == 0){
                    dp[i][j] = true;
                }else if(i == 0){
                    dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
                }else if(j == 0){
                    dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
                }else{
                    dp[i][j] = (dp[i - 1][j] && s1.charAt(i  - 1) == s3.charAt(i + j - 1) || (dp[i][j - 1] && s2.charAt(j  -1) == s3.charAt(i + j - 1)));
                }
            }
        }

        if(dp[s1.length()][s2.length()]){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }

    }

    public static boolean determin(String s1, String s2, String s3){
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        for(int i = 0; i < s1.length() + 1; i++){
            for(int j = 0; j < s2.length() + 1; j ++){
                if(i == 0 && j == 0){
                    dp[i][j] = true;
                }else if(i == 0){
                    dp[i][j] = (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
                }else if(j == 0){
                    dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
                }else{
                    dp[i][j] = (dp[i - 1][j] && s1.charAt(i  - 1) == s3.charAt(i + j - 1) || (dp[i][j - 1] && s2.charAt(j  -1) == s3.charAt(i + j - 1)));
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }


}
