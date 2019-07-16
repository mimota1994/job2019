package main.school2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bf.readLine();

        char[] array = bf.readLine().toCharArray();

        int result = 0;
        for(int i = 0; i < array.length; i++){
            char tmp = array[i];
            switch (tmp){
                case 'L' :
                    result = result -1;
                    break;
                case 'R' :
                    result = result + 1;
                    break;
            }
        }

        while(result < 0){
            result += 4;
        }
        result = result % 4;

        switch (result){
            case 0:
                System.out.println("N");
                break;
            case 1:
                System.out.println("E");
                break;
            case 2:
                System.out.println("S");
                break;
            case 3:
                System.out.println("W");
                break;
        }


    }

}
