package main.school2019.zhaoshang;

import java.util.Scanner;

//解码方式
public class Solution_44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.nextLine().toCharArray();
        int[] dp = new int[array.length];

        dp[0] = 1;
        dp[1] = 2;

        for(int i = 2; i < array.length; i++){
            dp[i] += dp[i - 1];
            if(((array[i] - '0') + (array[i - 1] - '0') * 10) <= 26){
                dp[i] += dp[i - 2];
            }
        }

        System.out.println(dp[array.length - 1]);
    }
}
