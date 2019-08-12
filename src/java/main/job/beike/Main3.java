package main.job.beike;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];

        for(int i = 0; i < n; i++){
            array[i] = sc.nextLong();
        }

        Arrays.sort(array);

        int sum = 0;
        int j = -1;
        for(int i = 0; i < n; i++){
            if(j == -1){
                j = i + 1;
            }
            while(j < n){
                if(array[i] >= array[j] * 0.9){
                    j ++;
                }else{
                    break;
                }
            }
            sum += (j - i - 1);
        }
        System.out.println(sum);
    }

}
