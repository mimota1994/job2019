package main.school2019.kuaishou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution_18 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] matrix = new int[n][2];
        for(int i = 0; i < n; i++){
            String[] strs = bf.readLine().split(" ");
            matrix[i][0] = Integer.parseInt(strs[0]);
            matrix[i][1] = Integer.parseInt(strs[1]);
        }
        Arrays.sort(matrix, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
               if(o1[0] > o2[0]){
                   return 1;
               }else if(o1[0] < o2[0]){
                   return -1;
               }else{
                   if(o1[1] > o2[1]){
                       return 1;
                   }else if(o1[1] < o2[1]){
                       return -1;
                   }else{
                       return 0;
                   }
               }
            }
        });

        int[] dp = new int[n];
        dp[0] = 1;
        int max = 1;
        for(int i = 1; i < n; i++){
            int tmp = 0;
            int index = -1;
            for(int j = i - 1; j >= 0; j--){
                if(matrix[j][1] <= matrix[i][1] && matrix[j][1] > tmp){
                    tmp = matrix[j][1];
                    index = j;
                }
            }
            if(index == -1){
                dp[i] = 1;
            }else{
                dp[i] = dp[index] + 1;
            }
            if(dp[i] > max){
                max = dp[i];
            }
        }

        System.out.println(max);


    }

}
