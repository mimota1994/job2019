package main.school2019Test.kuaishou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_24 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int p = Integer.parseInt(strs[1]);
        int h = Integer.parseInt(strs[2]);
        int w = Integer.parseInt(strs[3]);

        strs = bf.readLine().split(" ");
        int[] array = new int[strs.length];

        for(int i =0; i < strs.length; i++){
            array[i] = Integer.parseInt(strs[i]);
        }

        int left = 1;
        int right = h > w ? w : h;

        int mid = 0;
        while(left < right){
            mid = (left + right) / 2;
            int row = h / mid;
            int col = w / mid;
            int sum = 0;
            for(int i =0; i < strs.length; i++){
                sum += (int)Math.ceil(array[i] / (col + 0.0));
            }
            int page = (int)Math.ceil(sum / (row + 0.0));
            if(page < p){
                left = mid + 1;
            }else if(page > p){
                right = mid - 1;
            }else{
                break;
            }
        }
        int i = 0;
        for(i = mid + 1; i <= right; i++){
            int row = h / i;
            int col = w / i;
            int sum = 0;
            for(int j =0; j < strs.length; j++){
                sum += (int)Math.ceil(array[j] / (col + 0.0));
            }
            int page = (int)Math.ceil(sum / (row + 0.0));
            if(page > p){
                break;
            }
        }
        System.out.println(i - 1);
    }

}
