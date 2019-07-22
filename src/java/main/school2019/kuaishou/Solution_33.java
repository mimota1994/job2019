package main.school2019.kuaishou;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


//今年的第几天
public class Solution_33 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        
        boolean isRun = false;
        if(year % 100 == 0) {
        	if(year % 400 == 0) {
        		isRun = true;
        	}
        }else {
        	if(year % 4 == 0) {
        		isRun = true;
        	}
        }
        
        int[] array = new int[] {0,31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i = 1; i < array.length; i++) {
        	array[i] = array[i] + array[i - 1];
        }
        
        int result = 0;
        if(!isRun) {
        	result = array[month - 1] + day;
        }else {
        	if(month > 2) {
        		result = array[month - 1] + day + 1;
        	}else {
        		result = array[month - 1] + day;
        	}
        }
        System.out.println(result);
    }
}
