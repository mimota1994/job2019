package main.school2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");

        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);

        strs = bf.readLine().split(" ");
        int[] array = new int[m];

        for(int i = 0; i < m; i ++){
            array[i] = Integer.parseInt(strs[i]);
        }

        int[] com = new int[n];

        for(int i = 0; i < m;i ++){
            com[array[i] - 1] ++;
        }

        int min = com[0];
        for(int i = 0; i < n; i++){
            if(com[i] < min){
                min = com[i];
            }
        }
        System.out.println(min);

    }
}
