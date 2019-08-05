package main.school2019Test.disifanshi;


import java.util.Scanner;

/**
 * 矩阵查数
 * 从左下角开始
 */
public class Solution_74 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int[][] matrix = new int[m][n];

        for(int i = 0; i < m; i++){
            String[] strs = sc.nextLine().split(" ");
            for(int j = 0; j < n; j++){
                matrix[i][j] = Integer.parseInt(strs[j]);
            }
        }

        int k = sc.nextInt();

        int row = m - 1;
        int col = 0;

        while(row >= 0 && col < n){
            if(matrix[row][col] > k){
                row --;
            }else if(matrix[row][col] < k){
                col ++;
            }else{
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);

    }
}

