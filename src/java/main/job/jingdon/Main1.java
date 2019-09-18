package main.job.jingdon;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(helper(array, n));

    }
    public static int helper(int[] array, int n){
        int[] minArray = new int[n];
        minArray[n - 1] = Integer.MAX_VALUE;
        for(int i = n - 1; i > 0; i--){
            minArray[i - 1] = Math.min(minArray[i], array[i]);
        }
        int max = 0;
        int result = 0;
        for(int i = 0; i < n; i ++){
            max = Math.max(max, array[i]);
            if(max <= minArray[i]){
                result ++;
            }
        }
        return result;
    }
}
