package main.school2019.kuaishou;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//字符串压缩
public class Solution_30 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.next().toCharArray();

        List<Integer> nums = new ArrayList<>();
        List<Character> chars = new ArrayList<>();
       int i = 0;
       while(i < array.length){
           chars.add(array[i]);
           int num = 0;
           int j = i;
           for(; j < array.length; j++){
               if(array[j] == array[i]){
                   num ++;
               }else{
                   break;
               }
           }
           i = j;
           nums.add(num);
       }
       String str = "";
       for(int k = 0; k < nums.size(); k++){
           str += (nums.get(k) + String.valueOf(chars.get(k)));
       }
        System.out.println(str);
    }

}
