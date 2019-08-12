package main.job.beike;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(assend(array, n));

    }

    public static int assend(int[] arr, int n){
        int result = -1;
        int[] dp = new int[n];


        for(int i = 0; i < n; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if((arr[i] > arr[j]) && (dp[j] + 1 > dp[i])){
                    dp[i] = dp[j] + 1;
                }
            }
            if(dp[i] > result){
                result = dp[i];
            }
        }
        return result;

    }
}
