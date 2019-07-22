package main.school2019.zhaoshang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//x游戏
public class Solution_40 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for(int i = 1; i <= n; i++){
			if(helper(i)){
				result ++;
			}
		}
		System.out.println(result);
	}

	public static boolean helper(int n){
		List<Integer> list = new ArrayList<>();
		int flag = n;
		while(n > 0){
			int tmp = n % 10;
			if(tmp == 2){
				list.add(5);
			}else if(tmp == 5){
				list.add(2);
			}else if(tmp == 6){
				list.add(9);
			}else if(tmp == 9){
				list.add(6);
			}else if(tmp == 0 || tmp == 1 || tmp == 8){
				list.add(tmp);
			}else{
				return false;
			}
			n /= 10;
		}
		int re = 0;
		for(int i = list.size() - 1; i >= 0; i--){
			re = re * 10 + list.get(i);
		}
		if(re == flag){
			return false;
		}
		return true;
	}

}
