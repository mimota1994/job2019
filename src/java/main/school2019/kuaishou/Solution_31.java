package main.school2019.kuaishou;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//解析加减法运算
public class Solution_31 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.next().toCharArray();

        char fu = '+';
        char shu;
        int sum = 0;
        int i = 0;
        while(i < array.length){
            if(array[i] - '0' >= 0 && array[i] - '0' <= 9){
                String str = "";
                while(i < array.length && array[i] - '0' >= 0 && array[i] - '0' <= 9){
                    str += String.valueOf(array[i ++]);
                }
                if(fu == '+'){
                    sum += (Integer.parseInt(str));
                }else{
                    sum -= (Integer.parseInt(str));
                }
            }else{
                fu = array[i ++];
            }
        }
        System.out.println(sum);
    }

}
