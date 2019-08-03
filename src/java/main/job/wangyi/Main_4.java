package main.job.wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class Main_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n ; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        for(int i = 0; i < q; i++){
            int k = 0;
            int x = sc.nextInt();
            for(int j = 0; j < n; j ++){
                if(array[j] >= x){
                    array[j] -= 1;
                    k += 1;
                }
            }
            System.out.println(k);
        }
        
    }
}
