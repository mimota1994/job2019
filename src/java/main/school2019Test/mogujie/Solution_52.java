package main.school2019Test.mogujie;

import java.util.Scanner;

//方格走法
//数据有点问题，需要+1
public class Solution_52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt() + 1;
        int y = sc.nextInt() + 1;
        int[][] matrix = new int[x][y];
        for(int i = 0; i < x; i ++){
            matrix[i][0] = 1;
        }

        for(int i = 0; i < y; i ++){
            matrix[0][i] = 1;
        }

        for(int i = 1; i < x; i ++){
            for(int j = 1; j < y; j++){
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
            }
        }

        System.out.println(matrix[x - 1][y - 1]);

    }
}
