package main.school2019Test.zhaoshang;

import java.util.Scanner;

//比特币买入卖出
public class Solution_38 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strs = sc.nextLine().split(" ");
		
		int[] array = new int[strs.length];
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(strs[i]);
		}
		
		int[] dp = new int[array.length];
		dp[1] = array[0];
		for(int i = 2; i < dp.length; i++) {
			dp[i] = Math.min(dp[i - 1], array[i - 1]);
		}
		
		int max = 0;
		for(int i = 1; i < array.length; i++) {
			int tmp = array[i] - dp[i];
			if(tmp > max) {
				max = tmp;
			}
		}
		System.out.println(max);
		
	}

}
