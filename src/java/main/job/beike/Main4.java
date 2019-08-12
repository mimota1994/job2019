package main.job.beike;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        if(n == 2){
            if(array[0] >= array[1]){
                System.out.println(array[0] - array[1] + 1);
                return;
            }
        }
        int sum = 0;
        for(int i = 1; i < array.length - 1; i++){
            sum += helper(array, i);
        }
        System.out.println(sum);
    }

    public static int helper(int[] array, int index){

        if(index == 0 || index == array.length - 1){
            return 0;
        }
        int tmp = array[index];
        int sum = 0;
        if(array[index] <= array[index - 1] && array[index] <= array[index + 1]){
            array[index] = array[index - 1] > array[index + 1] ? array[index + 1] + 1 : array[index - 1] + 1;
            sum += (array[index] - tmp);
            int a = helper(array, index - 1);
            int b = helper(array, index + 1);
            return a + b + sum;
        }else if(array[index] == array[index + 1]){
            array[index] ++;
            int a = helper(array, index - 1);
            int b = helper(array, index + 1);
            return 1 + a + b;
        }else{
            return 0;
        }
    }
}
