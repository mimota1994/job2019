package main.school2019Test.disifanshi;


import java.util.Scanner;

/**
 * 二分图的判定
 * 邻接矩阵
 * 用一个数组记录节点的颜色
 * 有三种状态
 * 0 没有着色
 * 1 黑色
 * 2 白色
 */
public class Solution_75 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][n];

        for(int i = 0; i < m; i++){
            int node1 = sc.nextInt() - 1;
            int node2 = sc.nextInt() - 1;
            matrix[node1][node2] = 1;
            matrix[node2][node1] = 1;
        }

        int[] flag = new int[n];
        //0代表没有找过
        //1代表黑色
        //2代表白色

        for(int i = 0; i < n; i++){
            if(flag[i] == 0){
                flag[i] = 1;
            }

            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 1){
                    if(flag[j] == flag[i]){
                        System.out.println("No");
                        return;
                    }else if(flag[j] == 0){
                        flag[j] = flag[i] == 1 ? 2 : 1;
                    }
                }
            }
        }
        System.out.println("Yes");

    }
}

