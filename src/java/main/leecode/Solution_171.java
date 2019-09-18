package main.leecode;

public class Solution_171 {


    public int titleToNumber(String s) {
        int n = s.length();
        int result = 0;
        for(int i = 0; i < n; i++){
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }

        return result;
    }
}
