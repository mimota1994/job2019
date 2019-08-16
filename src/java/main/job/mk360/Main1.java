package main.job.mk360;

import java.util.Scanner;

/**
 * 在 N * M 的网格上，我们放置一些 1 * 1 * 1  的立方体。
 * 每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。
 * 请你返回最终形体的表面积。
 *
 * solution1
 * 单独计算每个位置有多少个面积，这和他自身的大小，以及四周的大小有关
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println(helper(matrix, n, m));
    }

    public static long helper(int[][] matrix, int n, int m){
        int result = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j ++){
                if(matrix[i][j] == 0) continue;
                //自身能带来的收益，还要减去自身所带来的影响，因为叠放会使得一些面失效
                result += matrix[i][j] * 6 - (matrix[i][j] - 1) * 2;
                //先看左边
                if((i - 1) >= 0){
                    result -= Math.min(matrix[i][j], matrix[i - 1][j]);
                }
                //看右边
                if((i + 1) < n){
                    result -= Math.min(matrix[i][j], matrix[i + 1][j]);
                }
                //看上边
                if((j - 1) >= 0){
                    result -= Math.min(matrix[i][j], matrix[i][j - 1]);
                }
                //最后看下边
                if((j + 1) < m){
                    result -= Math.min(matrix[i][j], matrix[i][j + 1]);
                }
            }
        }
        return result;
    }
}
