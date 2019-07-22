package main.school2019.kuaishou;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


//字符串长度最大乘积
public class Solution_32 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.substring(1, str.length() - 1).split(",");
        
        int max = 0;
        for(int i = 0; i < strs.length; i++) {
        	for(int j = i + 1; j < strs.length; j++) {
        		if(helper(strs[i].substring(1, strs[i].length() - 1), strs[j].substring(1, strs[j].length() - 1))) {
        			if((strs[i].length() - 2) * (strs[j].length() - 2) > max) {
        				max = (strs[i].length() - 2) * (strs[j].length() - 2);
        			}
        		}
        	}
        }
        System.out.println(max);
    }
    
    public static boolean helper(String a, String b) {
    	char[] chars = a.toCharArray();
    	Map<Character, Integer> map = new HashMap<>();
    	for(int i = 0; i < chars.length; i++) {
    		if(map.containsKey(chars[i])) {
    			map.put(chars[i], map.get(chars[i]) + 1);
    		}else {
    			map.put(chars[i], 1);
    		}
    	}
    	
    	chars = b.toCharArray();
    	for(int i = 0; i < chars.length; i ++) {
    		if(map.containsKey(chars[i])) {
    			return false;
    		}
    	}
    	return true;
    }

}
