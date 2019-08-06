package main.school2019Test.xiaomi;


import java.util.Scanner;

/**
 * 最小立方数之和
 * 拆为立方数29825 结果为9,应该为4
 * 960299, dp 结果为5，应该为4
 * 更改了一下，可以有所优化
 *
 */
public class Solution_78 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(dpHelper(n));

    }

    public static int helper(int n){
        if(n <= 7){
            return n;
        }
        int tmp = (int)Math.pow(n, 1.0 / 3);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= tmp; i ++){
            int a = i * i * i;
            int b = helper(n - a);
            if((b + 1) < min){
                min = (b + 1);
            }
        }
        return min;
    }

    public static int dpHelper(int n){
        int[] dp = new int[n + 1];
        dp[1] = 1;

        for(int i = 1; i <= n; i++){
            dp[i] = Integer.MAX_VALUE;
            int a = (int)Math.pow(n, 1.0 / 3);
            if(a * a * a == i){
                dp[i] = 1;
                continue;
            }
            for(int j = 1; j * j * j <= i; j++){
                int tmp = dp[i - j *j * j];
                if((tmp + 1) < dp[i]){
                    dp[i] = tmp + 1;
                }
            }
        }
        return dp[n];
    }
}
