package main.job.wangyi;

import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        helper(array, 0);

        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }

        
    }

    public static void helper(int[] array, int index){
        if(index == array.length - 1){
            return;
        }

        helper(array, index + 1);
        int min = Integer.MAX_VALUE;
        int flag = -1;
        for(int i = index + 1; i < array.length; i++){
            if((array[index] + array[i]) % 2 == 1){
                if(array[i] < min){
                    min = array[i];
                    flag = i;
                }
            }
        }

        if(flag < 0){
            return;
        }else{
            int tmp = array[index];
            array[index] = array[flag];
            array[flag] = tmp;
        }
    }
}
