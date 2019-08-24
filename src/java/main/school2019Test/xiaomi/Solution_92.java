package main.school2019Test.xiaomi;

import java.util.Scanner;

/**
 * 计算题
 * 给定n个非负整数表示每个宽度为1的柱子的高度题，计算按此排列的柱子，下雨之后能接多少雨水。
 * soultion1
 * dp的思想，记录左边最大和右边最大
 * 单个单个计算
 */
public class Solution_92 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(",");

        int n = strs.length;

        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(strs[i]);
        }

       int[] leftMax = new int[n];
       int[] rightMax = new int[n];

       leftMax[0] = -1;
       rightMax[rightMax.length - 1] = -1;

       for(int i = 1; i < n; i++){
           leftMax[i] = Math.max(leftMax[i - 1], array[i - 1]);
           rightMax[n - i - 1] = Math.max(rightMax[n - i], array[n - i]);
       }


        long result = 0;
        for(int i = 0; i < n; i ++){
            int dump = Math.min(leftMax[i], rightMax[i]);
            if(dump - array[i] > 0){
                result += (dump - array[i]);
            }
        }

        System.out.println(result);


    }
}
