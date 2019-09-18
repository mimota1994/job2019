package main.leecode;

public class Solution_344 {
    public void reverseString(char[] s) {
        int n = s.length;
        int i = 0;
        int j = n - 1;
        while(i < j){
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i ++;
            j --;
        }
    }
}
