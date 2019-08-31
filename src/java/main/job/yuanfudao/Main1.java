package main.job.yuanfudao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] array = new int[n];

        for(int i= 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < array.length){
            int j = i;
            while(j < array.length && array[j] == array[i]){
                j ++;
            }
            int num = j - i;
            if(num <= m){
                for(int k = 0; k < num; k++){
                    list.add(array[i]);
                }
            }
            i = j;
        }
        for(int number : list){
            System.out.print(number + " ");
        }
    }
}
