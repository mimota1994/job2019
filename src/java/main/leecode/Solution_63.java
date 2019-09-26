package main.leecode;

public class Solution_63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 && j == 0){
                    if(obstacleGrid[i][j] == 1){
                        return 0;
                    }else{
                        obstacleGrid[i][j] = 1;
                    }
                }else{
                    if(obstacleGrid[i][j] == 1){
                        obstacleGrid[i][j] = 0;
                    }else{
                        int sum = 0;
                        if(i > 0){
                            sum = sum + obstacleGrid[i - 1][j];
                        }
                        if(j > 0){
                            sum += obstacleGrid[i][j - 1];
                        }
                        obstacleGrid[i][j] = sum;
                    }
                }

            }
        }


        return obstacleGrid[n - 1][m - 1];
    }
}
