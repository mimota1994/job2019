package main.school2019Test.zhaoshang;

import java.util.Scanner;

//鸡鸭分类问题
public class Solution_37 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] array = sc.next().toCharArray();
		
		int num = 0;
		for(int i = array.length - 2; i >= 0; i --) {
			for(int j = i; j <= array.length - 2; j++) {
				if(array[j] == 'D' && array[j + 1] == 'C') {
					char tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
					num ++;
				}else {
					break;
				}
			}
		}
		System.out.println(num);
	}

}
