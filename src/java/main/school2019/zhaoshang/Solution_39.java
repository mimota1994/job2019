package main.school2019.zhaoshang;

import java.util.Scanner;

//爱吃猫粮的小猫
public class Solution_39 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strs = sc.nextLine().split(" ");
		int h = sc.nextInt();
		
		int[] array = new int[strs.length];
		
		int left = 1;
		int right = 0;
		for(int i = 0; i < strs.length; i++) {
			array[i] = Integer.parseInt(strs[i]);
			if(array[i] > right) {
				right = array[i];
			}
		}
		
		int mid = 0;
		int sum = 0;
		int result = right;
		while(left <= right) {
			sum = 0;
			mid = (left + right) / 2;
			for(int i = 0; i < array.length; i++) {
				sum += Math.ceil(array[i] / (double)mid);
				if(sum > h) {
					left = mid + 1;
					break;
				}
			}
			 if(sum <= h){
				right = mid - 1;
				result = Math.min(result, mid);
			}
		}
		System.out.println(result);
	}

}
