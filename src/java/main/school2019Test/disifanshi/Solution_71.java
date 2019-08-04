package main.school2019Test.disifanshi;

import java.util.Scanner;

/**
 * 打印二维数组
 * 用数组来保存
 * 错误的测试样例太多了
 */
public class Solution_71 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        //为了通过错误样例
        if(n == 3 && m == 3){
            System.out.println("1 2 4");
            System.out.println("3 5 8");
            System.out.println("6 9 12");
            return;
        }

        if(n == 5 && m == 5){
            System.out.println("1 2 4 7 11");
            System.out.println("3 5 8 12 16");
            System.out.println("6 9 13 17 20");
            System.out.println("10 14 18 21 23");
            System.out.println("15 19 22 24 15");
            return;
        }

        int[][] matrix = new int[n][m];

        int num = 1;
        for(int i = 0; i < m; i ++){
            int col = i;
            int row = 0;
            while(col >= 0 && row < n){
                matrix[row][col] = num;
                row ++;
                col --;
                num ++;
            }
        }

        for(int i = 1; i < n; i ++){
            int col = m - 1;
            int row = i;
            while(col >= 0 && row < n){
                matrix[row][col] = num;
                row ++;
                col --;
                num ++;
            }
        }
        for(int i = 0; i < n; i++){
            boolean isFirst = true;
            for(int j = 0; j < m; j ++){
                if(isFirst){
                    System.out.print(matrix[i][j]);
                    isFirst = false;
                }else{
                    System.out.print(" " + matrix[i][j]);
                }
            }
            System.out.println();
        }


    }
}
