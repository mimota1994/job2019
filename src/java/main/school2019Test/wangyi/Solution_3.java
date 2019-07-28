package main.school2019Test.wangyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        for(int i = 0; i < num; i++){
            bf.readLine();
            char[] array = bf.readLine().toCharArray();

            int result = 0;
            int flag = 0;
            for(int j = 0; j < array.length; j++){
                if(flag == 2){
                    result ++;
                    flag = 0;
                }else{
                    if(flag != 0){
                        flag ++;
                    }else if(array[j] == '.'){
                        flag ++;
                    }
                }
            }
            if(flag != 0){
                result ++;
            }
            System.out.println(result);
        }
    }

}

