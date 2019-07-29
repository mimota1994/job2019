package main.school2019Test.zhaoshang;

import java.util.Arrays;
import java.util.Scanner;

//挑选代表
//贪心
public class Solution_50 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][2];
        for(int i = 0; i < n; i++){
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }

        Arrays.sort(array, ((o1, o2) -> o1[1] - o2[1]));
        int a = -1;
        int b = -1;
        int num = 0;
        for(int i = 0; i < n; i ++){
            int left = array[i][0];
            int right = array[i][1];

            int flag = 0;
            if(a >= left && a <= right){
                flag ++;
            }

            if(b >= left && b <= right){
                flag ++;
            }

            if(flag == 0){
                a = right - 1;
                b= right;
                num += 2;
            }else if(flag == 1){
                a = b;
                b = right;
                num += 1;
            }

        }

        System.out.println(num);

    }
}
