package main.school2019.zhaoshang;

import java.util.Arrays;
import java.util.Scanner;

//漂流船问题
public class Solution_45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");

        int[] array = new int[strs.length];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(strs[i]);
        }

        int limit = sc.nextInt();

        Arrays.sort(array);

        int i = 0;
        int j = array.length - 1;

        int result = 0;
        while(i <= j){
            result ++;
            if((array[j] + array[i]) > limit){
                j --;
            }else{
                j --;
                i ++;
            }
        }
        System.out.println(result);
    }
}
