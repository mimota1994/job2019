package main.job.alibaba;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            String[] strs = sc.nextLine().split(",");
            for(int j = 0; j < n; j++){
                matrix[i][j] = Integer.parseInt(strs[j]);
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int tmp = helper(matrix, 0, i, n);
            min = Math.min(min, tmp);
        }
        System.out.println(min);
    }

    public static int helper(int[][] matrix, int i, int j, int n){
        if(i < 0 || j < 0 || i > n || j >= n){
            return Integer.MAX_VALUE / 2;   //表示永远走不到了
        }else if(i == n){
            return 0;   //如果本来从末尾出发，那么所需的时间为0
        }else{
            int a = Integer.MAX_VALUE;
            int b = Integer.MAX_VALUE;
            if(j + 1 < n){
                a = helper(matrix, i, j + 2, n) + matrix[i][j + 1];
            }
            b = helper(matrix, i + 2, j, n) + matrix[i + 1][j];
            return Math.min(a, b);
        }
    }
}
