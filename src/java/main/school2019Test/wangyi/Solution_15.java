package main.school2019Test.wangyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//小易的字典
public class Solution_15 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");

        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);
        int k = Integer.parseInt(strs[2]);

        char[] array = new char[n + m];
        for(int i = 0; i < n; i ++){
            array[i] = 'a';
        }

        for(int i = 0; i < m; i ++){
            array[i + n] = 'z';
        }

        for(int i = n - 1; i >= 0; i --){
            char[] tmp = array.clone();

        }


    }
}
