package main.school2019.kuaishou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_16 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bf.readLine();
        String[] strs = bf.readLine().split(" ");

        int[] array = new int[strs.length];
        for(int i = 0; i  < strs.length; i++){
            array[i] = Integer.parseInt(strs[i]);
        }

        int left = 0;
        int right = array.length - 1;

        long left_sum = array[left];
        long right_sum = array[right];

        long max = 0;

        while(left < right){
            if(left_sum < right_sum){
                left ++;
                if(left < right){
                    left_sum += array[left];
                }
            }else if(left_sum > right_sum){
                right --;
                if(left < right){
                    right_sum += array[right];
                }
            }else{
                if(left_sum > max){
                    max = left_sum;
                }
                left ++;
                right --;
                if(left < right){
                    left_sum += array[left];
                    right_sum += array[right];
                }
            }
        }
        System.out.println(max);
    }
}
