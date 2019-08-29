package main.leecode;

import org.omg.CORBA.INTERNAL;

public class Solution_48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                max = Math.max(max, matrix[i][j]);
                min = Math.min(min, matrix[i][j]);
            }
        }

        if(min < 0){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    matrix[i][j] -= min;
                }
            }
            max -= min;
        }

        max = max + 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] <= max){
                    matrix[j][n - i - 1] += matrix[i][j] * max;
                }else{
                    int tmp = matrix[i][j] % max;
                    matrix[j][n - i - 1] += tmp * max;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] /= max;
            }
        }

        if(min < 0){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    matrix[i][j] += min;
                }
            }
        }

    }
}
