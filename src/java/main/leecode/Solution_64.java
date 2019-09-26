package main.leecode;

public class Solution_64 {

    public int minPathSum(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        for(int i =0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i != 0 || j != 0){
                    int min = Integer.MAX_VALUE;
                    if(i > 0 && grid[i - 1][j] < min){
                        min = grid[i - 1][j];
                    }
                    if(j > 0 && grid[i][j - 1] < min){
                        min = grid[i][j - 1];
                    }
                    grid[i][j] += min;
                }
            }
        }

        return grid[n - 1][m - 1];

    }
}
