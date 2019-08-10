package main.school2019Test.xiaomi;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 爬楼梯
 * dp
 * 但是数字可能过大，需要自己写一个加法器
 */
public class Solution_80 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 2){
            System.out.println(n);
            return;
        }
        String[] dp = new String[n + 1];
        dp[1] = "1";
        dp[2] = "2";
        for(int i = 3; i <= n; i++){
            dp[i] = add(dp[i - 1], dp[i - 2]);
        }

        System.out.println(dp[n]);
    }

    public static String add(String str1, String str2){
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        int carry = 0;
        String result = "";

        int i = array1.length - 1;
        int j = array2.length - 1;
        while(i >= 0 && j >= 0){
            int num1 = array1[i] - '0';
            int num2 = array2[j] - '0';
            int tmp = num1 + num2 + carry;
            result = (tmp % 10) + result;
            carry = tmp / 10;
            i --;
            j --;
        }

        if(i >= 0){
            int num1 = array1[i] - '0';
            int tmp = num1 + carry;
            result = (tmp % 10) + result;
            carry = tmp / 10;
            i --;
        }

        if(j >= 0){
            int num2 = array2[j] - '0';
            int tmp = num2 + carry;
            result = (tmp % 10) + result;
            carry = tmp / 10;
            j --;
        }
        if(carry != 0){
            result = carry + result;
        }
        return result;
    }


}
