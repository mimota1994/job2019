package main.job.donfancaifu2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int length = array.length;
        if(length == 0){
            System.out.println(0);
            return;
        }
        int[][] dp1 = new int[length][3];
        int[][] dp2 = new int[length][3];

        for(int i = 1; i < length; i++){
            int d = array[i] - array[i  - 1];
            for(int j = 1; j <= 2; j ++){
                dp1[i][j] = Math.max(dp2[i - 1][j  -1] + Math.max(d, 0), dp1[i - 1][j] + d);
                dp2[i][j] = Math.max(dp2[i - 1][j], dp1[i][j]);
            }
        }

        System.out.println(dp2[length - 1][2]);
    }

    public static int dpHelper(int[] array){
        int length = array.length;
        if(length == 0){
            return 0;
        }
        int[][] dp1 = new int[length][3];
        int[][] dp2 = new int[length][3];

        for(int i = 1; i < length; i++){
            int d = array[i] - array[i  - 1];
            for(int j = 1; j <= 2; j ++){
                dp1[i][j] = Math.max(dp2[i - 1][j  -1] + Math.max(d, 0), dp1[i - 1][j] + d);
                dp2[i][j] = Math.max(dp2[i - 1][j], dp1[i][j]);
            }
        }

        return dp2[length - 1][2];
    }
}


