package main.school2019Test.zhaoshang;

import java.util.Scanner;

//员工考勤
public class Solution_43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = helper(2, n - 2) + helper(1, n - 1) + helper(0, n);
        System.out.println(m);

    }

    public static int helper(int i, int j){
        if(i <= 0 || j <= 0){
            return 1;
        }else{
            return helper(i - 1, j) + helper(i, j - 1);
        }
    }
}
