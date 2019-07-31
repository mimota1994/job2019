package main.school2019Test.mogujie;

import java.util.Scanner;

//链表合并
public class Solution_55 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs_1 = sc.nextLine().split(" ");
        String[] strs_2 = sc.nextLine().split(" ");

        int[] ints_1 = new int[strs_1.length];
        int[] ints_2 = new int[strs_2.length];
        for(int i = 0; i < ints_1.length; i++){
            ints_1[i] = Integer.parseInt(strs_1[i]);
        }

        for(int i = 0; i < ints_2.length; i++){
            ints_2[i] = Integer.parseInt(strs_2[i]);
        }

        int i = 0;
        int j = 0;
        while(i < ints_1.length && j < ints_2.length){
            if(ints_1[i] < ints_2[j]){
                System.out.print(ints_1[i ++] + " ");
            }else{
                System.out.print(ints_2[j ++] + " ");
            }
        }

        if(i < ints_1.length){
            while (i < ints_1.length){
                System.out.print(ints_1[i ++] + " ");
            }
        }

        if(j < ints_2.length){
            while (j < ints_2.length){
                System.out.print(ints_2[j ++] + " ");
            }
        }


    }
}