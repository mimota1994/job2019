package main.job.unity;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            int course = 0;
            for(int j = i + 1; j < n; j++){
                if(array[j] < array[i]){
                    course ++;
                }
            }
            System.out.print(course + " ");
        }
    }
}
