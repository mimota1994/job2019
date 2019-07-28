package main.school2019Test.kuaishou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_22 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] array = new int[n];
        for(int i = 0 ;i < n; i++){
            String str = bf.readLine();
            str = str.substring(str.length() - 6);
            array[i] = Integer.parseInt(str);
        }

        Arrays.sort(array);
        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
    }

}
