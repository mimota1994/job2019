package main.school2019Test.wangyihuyu;

import java.util.Scanner;

/**
 * 一封奇怪的信
 */
public class Solution_69 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[26];

        for(int i= 0; i < 26; i++){
            array[i] = sc.nextInt();
        }

        sc.nextLine();
        char[] chars = sc.nextLine().toCharArray();

        int col = 0;
        int row = 0;
        for(int i = 0; i < chars.length; i++){
            if((col + array[chars[i] - 'a']) > 100){
                row ++;
                col = array[chars[i] - 'a'];
            }else{
                col += array[chars[i] - 'a'];
            }
        }

        System.out.println((row + 1) + " " + col);

    }
}
