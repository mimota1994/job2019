package main.school2019Test.kuaishou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_19 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bf.readLine());
        int max = 0;
        int[] array = new int[m];
        for(int i = 0; i < m; i++){
            array[i] = Integer.parseInt(bf.readLine());
            if(array[i] > max){
                max = array[i];
            }
        }
        long[] bp = helper(max);

        for(int i = 0; i < m; i ++){
            System.out.println(bp[array[i]]);
        }
    }

    public static long[] helper(int n){
        long[] bp = new long[n + 1];
        bp[0] = 1;
        bp[1] = 1;

        for(int i = 2; i <= n; i ++){
            int tmp = 0;
            int index = 1;
            while(index <= i){
                tmp += bp[i - index];
                if(tmp > ((int)Math.pow(10, 9) + 3)){
                    tmp = tmp % ((int)Math.pow(10, 9) + 3);
                }
                index = index << 1;
            }
            bp[i] = tmp;
        }
        return bp;
    }
}
