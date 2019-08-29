package main.leecode;

import java.util.*;

public class Solution_49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            String tmp = helper(strs[i]);
            if(map.containsKey(tmp)){
                map.get(tmp).add(strs[i]);
            }else{
                List<String> list = new LinkedList<>();
                list.add(strs[i]);
                map.put(tmp, list);
            }
        }
        List<List<String>> total = new ArrayList<>(map.values());
        return total;
    }

    public String helper(String str){
        int[] array = new int[26];
        for(int i = 0; i < str.length(); i++){
            array[str.charAt(i) - 'a'] ++;
        }
        String result = "";
        for(int i = 0; i < 26; i++){
            if(array[i] > 0){
                result += (String.valueOf((char)('a' + i)) + array[i]);
            }
        }
        return result;
    }
}
