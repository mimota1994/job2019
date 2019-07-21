package main.school2019.kuaishou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


//合并数组
public class Solution_26 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] strs =  str.split(",");
        int n = strs.length;
        int[] array1 = new int[strs.length];
        for(int i = 0; i < strs.length; i++){
            array1[i] = Integer.parseInt(strs[i]);
        }

        if(!scanner.hasNext()){
            System.out.println(str);
            return;
        }
        strs = scanner.next().split(",");
        int m = strs.length;
        int[] array2 = new int[strs.length];
        for(int i = 0; i < strs.length; i++){
            array2[i] = Integer.parseInt(strs[i]);
        }


        int[] array = new int[n + m];

        int i = 0;
        int j = 0;
        int index = 0;
        while(i < n && j < m){
            array[index ++] = array1[i] > array2[j] ? array2[j ++] : array1[i ++];
        }

        if(i < n){
            while(i < n){
                array[index ++] = array1[i ++];
            }
        }

        if(j < m){
            while(j < m){
                array[index ++] = array2[j ++];
            }
        }

        boolean isFirst = true;
        for(int k = 0; k < (n + m); k++){
            if(isFirst){
                System.out.print(array[k]);
                isFirst = false;
            }else{
                System.out.print("," + array[k]);
            }
        }

    }

}
