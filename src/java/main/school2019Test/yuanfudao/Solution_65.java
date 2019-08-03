package main.school2019Test.yuanfudao;

import java.util.Scanner;

/**
 * 拍照队形
 * 90%
 */
public class Solution_65 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[] array = sc.nextLine().toCharArray();
        int index = 0;
        int x = (n - 1) / 3;
        for(int i = 0; i < x; i++){
            spaceHelper(i);
            System.out.print(String.valueOf(array[index ++]));
            spaceHelper(2 * (x - i - 1) + 1);
            System.out.print(String.valueOf(array[index ++]));
            spaceHelper(i);
            System.out.println();
        }

        for(int i = 0; i <=x ; i++){
            spaceHelper(x);
            System.out.print(String.valueOf(array[index ++]));
            spaceHelper(x);
            System.out.println();
        }


    }

    public static void spaceHelper(int x){
        for(int i = 0; i < x; i++){
            System.out.print(" ");
        }
    }
}
