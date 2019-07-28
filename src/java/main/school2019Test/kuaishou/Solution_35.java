package main.school2019Test.kuaishou;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


//a/b
public class Solution_35 {
    public static void main(String[] args) throws IOException {
        
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	
    	if(a % b == 0) {
    		System.out.println(a / b);
    		return;
    	}
    	
    	int zhen = a / b;
    	a = a % b;
    	
    	List<Integer> list = new ArrayList();
    	Map<Integer, Integer> map = new HashMap<>();
    	int shan = 0;
    	int yu = 0;
    	
    	boolean isXunhuan = true;
    	int index = 0;
    	while(true) {
    		shan = a / b;
    		list.add(shan);
    		yu = a % b;
    		if(yu == 0) {
    			isXunhuan = false;
    			break;
    		}
    		if(map.containsKey(yu)) {
    			isXunhuan = true;
    			index = map.get(yu);
    			break;
    		}else {
    			map.put(yu, list.size());
    		}
    		a = yu * 10;
    	}
    	
    	String str = "" + zhen + ".";
    	if(isXunhuan) {
    		for(int i = 1; i < index; i++) {
    			str += list.get(i);
    		}
    		str += "(";
    		for(int i = index; i < list.size(); i++) {
    			str += list.get(i);
    		}
    		str += ")";
    	}else {
    		for(int i = 1; i < list.size(); i++) {
    			str += list.get(i);
    		}
    	}
    	
    	System.out.println(str);
    	
    }
}
