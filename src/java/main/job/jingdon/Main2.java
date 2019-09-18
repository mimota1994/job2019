package main.job.jingdon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[2 * n][2 * n];

        int[] v = new int[2 * n];
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < m; i++){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            matrix[a][b] = 1;
            matrix[b][a] = 1;
            v[a] ++;
            v[b] ++;
            set.add(a);
            set.add(b);
        }

        while(!set.isEmpty()){
            Arrays.sort(v);

        }

        //找到一个度最大的，删除，如果有度相同的


    }
}
