package main.school2019Test.mogujie;

import java.util.Scanner;

//输出指定长度的子串
public class Solution_54 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.nextLine().toCharArray();
        int n = sc.nextInt();
        if(n <= 0 || n > array.length){
            System.out.println(-1);
            return;
        }

        for(int i = 0; i <= array.length - n; i++){
            for(int j = i; j < i + n; j++){
                System.out.print(array[j]);
            }
            System.out.print(" ");
        }
    }
}
