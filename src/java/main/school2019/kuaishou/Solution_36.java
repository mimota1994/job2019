package main.school2019.kuaishou;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


//最小代价爬楼
public class Solution_36 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] strs = sc.nextLine().split(",");
        int[] array = new int[strs.length];
        for(int i = 0; i < array.length; i++) {
        	array[i] = Integer.parseInt(strs[i]);
        }
        
        int[] dp = new int[array.length];
        for(int i = 2; i < dp.length; i++) {
        	dp[i] = Math.min(dp[i - 1] + array[i - 1], dp[i - 2] + array[i - 2]);
        }
        
        int n = strs.length;
        int min = Math.min(array[n - 2] + dp[n - 2], array[n - 1] + dp[n - 1]);
        System.out.println(min);
        
  

    }
}
