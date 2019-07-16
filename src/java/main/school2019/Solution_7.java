package main.school2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_7 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine().trim());
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            String[] strs = bf.readLine().split(" ");

            int hour = Integer.parseInt(strs[0]);
            int minute = Integer.parseInt(strs[1]);

            array[i] = hour * 60 + minute;
        }
        int time = Integer.parseInt(bf.readLine().trim());

        String[] strs = bf.readLine().split(" ");
        int hour = Integer.parseInt(strs[0].trim());
        int minute = Integer.parseInt(strs[1].trim());
        int classTime = hour * 60 + minute;

        int max = 0;
        for(int i = 0; i < n; i ++){
            if(array[i] > max && (array[i] + time) <= classTime){
                max = array[i];
            }
        }
        System.out.println(max / 60 + " "  + max % 60);


    }
}
