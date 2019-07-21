package main.school2019.kuaishou;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//归一化
public class Solution_21 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] array = bf.readLine().toCharArray();

        int[] nums = new int[26];
        for(int i = 0; i < array.length; i++){
            nums[array[i] - 97] ++;
        }

        String str = "";
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                str += String.valueOf((char)(i + 97)) + nums[i];
            }
        }
        System.out.println(str);
    }
}
