package main.leecode;

public class Solution_807 {

    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int n = grid.length;
        int[] rowMax = new int[n];
        int[] colMax = new int[n];

        for(int i = 0; i < n; i++){
            int max = 0;
            for(int j = 0; j < n; j++){
                max = max > grid[i][j] ? max : grid[i][j];
            }
            rowMax[i] = max;
        }

        for(int j = 0; j < n; j++){
            int max = 0;
            for(int i = 0; i < n; i++){
                max = max > grid[i][j] ? max : grid[i][j];
            }
            colMax[j] = max;
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int max = rowMax[i] > colMax[j] ? colMax[j] : rowMax[i];
                sum += (max - grid[i][j]);
            }
        }
        return sum;

    }
}
