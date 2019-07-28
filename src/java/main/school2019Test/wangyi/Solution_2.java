package main.school2019Test.wangyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2 {

    public static void main(String[] args) throws IOException {
        try{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String[] strs = bf.readLine().split(" ");

            int left = Integer.parseInt(strs[0]);
            int right = Integer.parseInt(strs[1]);

            int result = 0;

            for(int i = left; i <= right; i++) {
                switch (i % 3) {
                    case 1:
                        ;
                        break;
                    case 2:
                        ++result;
                        break;
                    case 0:
                        ++result;
                        break;
                }
            }
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

