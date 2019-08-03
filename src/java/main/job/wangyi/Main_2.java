package main.job.wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){

            int n = sc.nextInt();
            long[] array = new long[n];
            for(int j = 0; j < n; j++){
                array[j] = sc.nextLong();
            }

            Arrays.sort(array);
            int index = n - 1;
            while(index > 0){
                long ll = array[index - 1] + array[(index + 1) % n];
                if(array[index] < ll){
                    System.out.println("YES");
                    break;
                }else{
                    long tmp = array[index];
                    array[index] = array[index - 1];
                    array[index - 1] = tmp;
                    index --;
                }
            }
            if(index == 0){
                System.out.println("NO");
            }

        }
        
    }
}
