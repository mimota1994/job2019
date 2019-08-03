package main.job.wangyi;

import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int p = sc.nextInt() - 1;
            int num = 0;
            for(int j = 0; j < n; j++){
                if(array[j] <= array[p] && j != p){
                    num ++;
                }
            }
            System.out.printf("%.6f", (num / (n + 0.0)) * 100);
            System.out.println();
        }
    }
}
