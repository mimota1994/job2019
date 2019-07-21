package main.school2019.kuaishou;

import java.io.IOException;
import java.util.Scanner;


//最少数量货物装箱
public class Solution_28 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int index = n > 7 ? n : 7;
        int[] dp = new int[index + 1];


        for(int i= 0; i < 7; i++){
            dp[i] = 0;
        }
        dp[3] = 1;
        dp[5] = 1;
        dp[7] = 1;
        dp[6] = 2;

        for(int i = 8; i <= n; i++){
            int a = dp[i - 3];
            int b = dp[i - 5];
            int c = dp[i - 7];

            if(a == 0 && b == 0 && c == 0){
                dp[i] = 0;
            }else{
                int min = Integer.MAX_VALUE;
                if(a != 0 && a < min){
                    min = a;
                }
                if(b != 0 && b < min){
                    min = b;
                }
                if(c != 0 && c < min){
                    min = c;
                }
                dp[i] = min + 1;
            }
        }

        int result = dp[n];
        if(result == 0){
            System.out.println(-1);
        }else{
            System.out.println(result);
        }

    }

}
