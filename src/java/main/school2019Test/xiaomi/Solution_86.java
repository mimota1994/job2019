package main.school2019Test.xiaomi;


import java.util.Scanner;

/**
 * 地鼠逃跑计划
 * solution1
 * 回溯法
 */
public class Solution_86 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(helper(m, n, x + 1, y + 1, k));


    }

    public static int helper(int m ,int n, int x, int y, int k){
        if(k < 0){
            return 0;
        }else if((x <= 0 || x > m || y <= 0 || y > n) && k >= 0){
            return 1;
        }else{
            return helper(m, n, x - 1, y, k - 1) +
            helper(m, n, x + 1, y, k - 1) +
            helper(m, n, x , y - 1, k - 1) +
            helper(m, n, x , y + 1, k - 1);
        }
    }
}
