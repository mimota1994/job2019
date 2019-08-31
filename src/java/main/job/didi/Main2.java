package main.job.didi;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = sc.nextInt();
        int cost = sc.nextInt();

        int[] array1 = new int[n];
        for(int i = 0; i < n; i++){
            array1[i] = sc.nextInt();
        }

        int[] array2 = new int[n];
        for(int i = 0; i < n; i++){
            array2[i] = sc.nextInt();
        }

        int index1 = 0;
        int index2 = 0;
        int sum  = 0;
        while(index1 < n && index2 < n){

            int i = index2;
            for(; i < n; i++){
                if(array2[i] == array1[index1]){
                    break;
                }
            }
            int j = index1;
            for(; j < n; j ++){
                if(array1[j] == array2[index2]){
                    break;
                }
            }

            if(i < j){
                index2 = i + 1;
                index1 ++;
            }else{
                index1 = j + 1;
                index2 ++;
            }

            if(index1 < n && index2 < n){
                sum ++;
            }

        }
        System.out.println(sum);
    }
}
