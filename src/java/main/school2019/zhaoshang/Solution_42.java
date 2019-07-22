package main.school2019.zhaoshang;

import java.util.Arrays;
import java.util.Scanner;

//糖果分配
public class Solution_42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] children_tmp  = sc.nextLine().split(" ");
        String[] sweets_tmp  = sc.nextLine().split(" ");

        int[] children = new int[children_tmp.length];
        int[] sweets = new int[sweets_tmp.length];

        for(int i = 0; i < children.length; i++){
            children[i] = Integer.parseInt(children_tmp[i]);
        }
        for(int i = 0; i < sweets.length; i++){
            sweets[i] = Integer.parseInt(sweets_tmp[i]);
        }


        Arrays.sort(children);
        Arrays.sort(sweets);

        int i = sweets.length - 1;
        int j = children.length - 1;

        int result = 0;
        while(i >= 0 && j >= 0){
            if(sweets[i] >= children[j]){
                result ++;
                i --;
                j --;
            }else{
                j --;
            }
        }
        System.out.println(result);
    }
}
