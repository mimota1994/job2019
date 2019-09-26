package main.leecode;

public class Solution_70 {

    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int d1 = 1;
        int d2 = 2;
        int res = 0;
        for(int i = 2; i < n; i++){
            res = d1 + d2;
            d1 = d2;
            d2 = res;
        }
        return res;

    }
}
