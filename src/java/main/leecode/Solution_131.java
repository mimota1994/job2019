package main.leecode;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Solution_131 extends LinkedHashMap {

    public static void main(String[] args) {
        Solution_131 s = new Solution_131();
        Object a = s.partition("aabc");
        System.out.println();
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(res, s,  new ArrayList<String>());
        return res;

    }

    private void backtrack(List<List<String>> res, String s, ArrayList<String> tmp) {
        if(s == null || s.length() == 0) res.add(new ArrayList<>(tmp));
        for(int i = 1; i <= s.length(); i++){
            if(isPalidrome(s.substring(0, i))){
                tmp.add(s.substring(0, i));
                backtrack(res, s.substring(i), tmp);
                tmp.remove(tmp.size() - 1);
            }
        }
    }

    private  boolean isPalidrome(String sb) {
        int left = 0;
        int right = sb.length() - 1;
        char[] chars = sb.toCharArray();
        while(left < right){
            if(chars[left] != chars[right]){
                return false;
            }
            left ++;
            right --;
        }

        return true;
    }
}

