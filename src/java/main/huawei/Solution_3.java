package main.huawei;

import java.util.Scanner;

public class Solution_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] array = sc.nextLine().toCharArray();
            int sum = 0;
            for(int i = 2; i < array.length; i ++){
                int num = array[i] - 'A';
                if(num >= 0 && num <= 5){
                    num = array[i] - 'A' + 10;
                }else{
                    num = array[i] - '0';
                }
                sum =sum * 16 + num;
            }
            System.out.println(sum);
        }
    }
}
