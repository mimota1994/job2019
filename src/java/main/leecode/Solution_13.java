package main.leecode;

import java.util.HashMap;
import java.util.Map;

public class Solution_13 {
    public int romanToInt(String s) {
        int sum = 0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i = 0; i < n; i++){
            char c = 'c';
            if(i + 1 < n){
                c = s.charAt(i + 1);
            }
            if(s.charAt(i) == 'I'){
                if(c == 'V' || c == 'X'){
                    sum -= 1;
                }else{
                    sum += 1;
                }
            }else if(s.charAt(i) == 'X'){
                if(c == 'L' || c == 'C'){
                    sum -= 10;
                }else{
                    sum += 10;
                }
            }else if(s.charAt(i) == 'C'){
                if(c == 'D' || c == 'M'){
                    sum -= 100;
                }else{
                    sum += 100;
                }
            }else{
                sum += map.get(s.charAt(i));
            }
        }

        return sum;


    }
}
