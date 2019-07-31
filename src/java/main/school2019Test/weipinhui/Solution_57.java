package main.school2019Test.weipinhui;

import java.util.Scanner;

//整数的倒数
public class Solution_57 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.nextLine().toCharArray();

        if(array[0] == '-'){
            System.out.print("-");
            for(int i = array.length - 1; i >= 1 ; i--){
                System.out.print(array[i]);
            }
        }else{
            for(int i = array.length - 1; i >= 0 ; i--){
                System.out.print(array[i]);
            }
        }

    }
}