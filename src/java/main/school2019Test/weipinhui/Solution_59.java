package main.school2019Test.weipinhui;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//有序矩阵中第k小的元素
//暴力n2log(n2)
//k大小的堆log(k) * n2
//n大小的空间记录每行当前最小数字的下标，k*n
public class Solution_59 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] array = new int[n * n];

        for(int i = 0; i < n * n; i ++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        System.out.println(array[k - 1]);

    }
}
