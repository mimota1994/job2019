package main.school2019Test.zhaoshang;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//排队唱歌
//0.冒泡n2
//1.逆序对nlog(n)
public class Solution_48 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(helper_1(array, 0, array.length - 1));

    }

    public static int helper_0(int[] array){
        int n = array.length;
        int result = 0;
        for(int i = n - 1; i >= 0 ; i--){
            for(int j = i; j < n - 1; j ++){
                if(array[j] > array[j + 1]){
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    result ++;
                }
            }
        }
        return result;
    }

    public static int helper_1(int[] array, int start, int end){
        if(start >= end){
            return 0;
        }else{
            int mid = (start + end) / 2;
            int a = helper_1(array, start, mid);
            int b = helper_1(array, mid + 1, end);

            int[] tmp = new int[end - start + 1];

            int i = mid;
            int j = end;
            int index = end -start;
            int r = 0;
            while(i >= start && j >= (mid + 1)){
                if(array[j] < array[i]){
                    r += (j - mid);
                    tmp[index --] = array[i --];
                }else{
                    tmp[index --] = array[j --];
                }
            }

            if(i >= start){
                while(i >= start){
                    tmp[index --] = array[i --];
                }
            }

            if(j >= (mid + 1)){
                while(j >= (mid + 1)){
                    tmp[index --] = array[j --];
                }
            }

            for(int k = start; k <= end; k ++){
                array[k] = tmp[k - start];
            }

            return r + a + b;
        }
    }
}
