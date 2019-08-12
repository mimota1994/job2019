package main.job.beike;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextLong();
        }

        long min = Long.MAX_VALUE;
        int index = -1;
        for(int i = 0; i < n - 1; i++){
            if(Math.abs(array[i] - array[i + 1]) < min){
                min = Math.abs(array[i] - array[i + 1]);
                index = i;
            }
        }
        System.out.println(array[index] + " " + array[index + 1]);
    }
}
