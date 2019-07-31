package main.huawei;

import java.util.Arrays;
import java.util.Scanner;

//明明的随机数
public class Solution_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();

            int[] array = new int[n];
            for(int i = 0; i < n; i++){
                array[i] = sc.nextInt();
            }

            Arrays.sort(array);

            int index = 0;
            int flag = 0;
            while(index < n){
                if(array[index] != array[flag] || index == 0){
                    System.out.println(array[index]);
                    flag = index;
                }
                index ++;
            }
        }



    }
}
