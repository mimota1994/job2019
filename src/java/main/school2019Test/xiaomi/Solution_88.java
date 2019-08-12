package main.school2019Test.xiaomi;


import java.util.Scanner;

/**
 * 数组操作
 * 输入一个无序整数数组，调整数组中数字的顺序， 所有偶数位于数组的前半部分，使得所有奇数位于数组的后半部分。
 * 要求时间复杂度为O(n)。
 * solution1
 * 双指针
 */
public class Solution_88 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        int[] array = new int[strs.length];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(strs[i]);
        }

        int i = 0;
        int j = array.length - 1;

        while(i < j){
            while((array[i] & 1) == 0 && i < j){
                i ++;
            }

            while((array[j] & 1) == 1 && i < j){
                j --;
            }
            if(i < j){
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i ++;
                j --;
            }
        }

        for(int k = 0; k < array.length; k++){
            System.out.print(array[k] + " ");
        }

    }
}
