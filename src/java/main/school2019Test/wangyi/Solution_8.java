package main.school2019Test.wangyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_8 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");

        int n = Integer.parseInt(strs[0]);
        int w = Integer.parseInt(strs[1]);


        strs = bf.readLine().split(" ");
        int[] array = new int[strs.length];

        for(int i = 0; i < strs.length; i++){
            array[i] = Integer.parseInt(strs[i]);
        }
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if(sum <= w){
            System.out.println((long)Math.pow(2,array.length));
            return;
        }
        Arrays.sort(array);

        System.out.println(helper(array, 0, w));
    }

    public static int helper(int[] array, int index, int threshold){
        if(threshold < 0){
            return 0;
        }
        if(threshold == 0){
            return 1;
        }
        if(index == array.length - 1){
            if(array[index] <= threshold){
                return 2;
            }else{
                return 1;
            }
        }else{
            return helper(array, index + 1, threshold - array[index])
                    + helper(array, index + 1, threshold);
        }
    }
}
