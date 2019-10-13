package main.leecode;

import java.util.HashMap;
import java.util.Map;

public class Solution_771 {
    public int numJewelsInStones(String J, String S) {
        Map<Character, Integer> map = new HashMap<>(52);
        for(int i = 0; i < J.length(); i++){
            char c = J.charAt(i);
            if(!map.containsKey(c)){
                map.put(J.charAt(i), 1);
            }
        }
        int sum = 0;
        for(int i = 0; i < S.length(); i++){
            if(map.containsKey(S.charAt(i))){
                sum ++;
            }
        }
        return sum;
    }
}
