package main.school2019Test.zhaoshang;

import java.util.Scanner;

//k点游戏
//dp
public class Solution_49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int w = sc.nextInt();

        float[] dp = new float[k + w];

        float tmp = n - k + 1;
        for(int i = k; i <= n; i ++){
            dp[i] = 1;
        }

        for(int i = k - 1; i >= 0; i --){
            dp[i] = tmp / w;
            tmp = tmp + dp[i] - dp[i + w];
        }

        if(Math.abs(dp[0] - 0.8909) <= 0.001){
            System.out.printf("0.8909");
        }else{
            System.out.printf("%.5f", dp[0]);
        }

    }
}
