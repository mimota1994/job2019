package main.school2019;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//瞌睡
public class Solution_10 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] str = bf.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        str = bf.readLine().split(" ");
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(str[i]);
        }

        str = bf.readLine().split(" ");
        int[] arrayFlag = new int[n];
        for(int i = 0; i < n; i++){
            arrayFlag[i] = Integer.parseInt(str[i]);
        }

        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i <= n - k; i++){
            int tmp = 0;
            for(int j = i; j < i + k; j ++){
                tmp += array[j] * (arrayFlag[j] ^ 1);
            }
            if(tmp > max){
                max = tmp;
                maxIndex = i;
            }
        }


        int result = 0;

        for(int i = 0; i < n; i++){
            if(i >= maxIndex && i < maxIndex + k){
                result += array[i];
            }else{
                result += array[i] * arrayFlag[i];
            }
        }

        System.out.println(result);

    }
}
