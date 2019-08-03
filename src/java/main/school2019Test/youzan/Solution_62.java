package main.school2019Test.youzan;

import java.util.Scanner;

/**
 * 查找数组众数
 */
public class Solution_62 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.substring(1, str.length() - 1).split(",");

        int[] array = new int[strs.length];

        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(strs[i]);
        }

        int sum = 1;
        int num = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] == num){
                sum ++;
            }else{
                sum --;
                if(sum <= 0){
                    sum = 1;
                    num = array[i];
                }
            }
        }
        System.out.println(num);
    }
}
