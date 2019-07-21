package main.school2019.wangyi;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//丰收
//二分查找
public class Solution_11 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] strs = bf.readLine().split(" ");
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(strs[i]);
        }
        int m  = Integer.parseInt(bf.readLine());
        strs = bf.readLine().split(" ");
        int[] queryArray = new int[m];
        for(int i = 0; i < m; i++){
            queryArray[i] = Integer.parseInt(strs[i]);
        }

        for(int i = 1; i < n; i++){
            array[i] = array[i - 1] + array[i];
        }

        for(int i = 0; i < m; i++){
            int tmp = queryArray[i];
            int left = 0;
            int right = n -1;
            while(left < right){
                int mid = (left + right) / 2;
                if(array[mid] > tmp){
                    right = mid - 1;
                }else if(array[mid] < tmp){
                    left = mid + 1;
                }else{
                    System.out.println(mid + 1);
                    break;
                }
            }

            if(left >= right){
                if(array[left] < tmp){
                    left ++;
                }
                System.out.println(left + 1);
            }
        }
    }
}
