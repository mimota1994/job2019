package main.school2019.kuaishou;

import java.io.IOException;
import java.util.Scanner;


//回文子串
public class Solution_29 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.next().toCharArray();

        int sum = 0;
        for(int i = 0; i < array.length; i++){

            int left = i;
            int right = i;
            while(left >= 0 && right <= array.length -1){
                if(array[left] == array[right]){
                    sum ++;
                    left --;
                    right ++;
                }else{
                    break;
                }
            }
        }

        for(int i =0, j = 1; j < array.length; i ++, j++){
            if(array[i] == array[j]){
                int left = i;
                int right = j;
                while(left >= 0 && right <= array.length -1){
                    if(array[left] == array[right]){
                        sum ++;
                        left --;
                        right ++;
                    }else{
                        break;
                    }
                }
            }
        }

        System.out.println(sum);

    }

}
