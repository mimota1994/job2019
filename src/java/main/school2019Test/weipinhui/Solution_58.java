package main.school2019Test.weipinhui;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//字符串的加法
public class Solution_58 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");

        char[] a = strs[0].toCharArray();
        char[] b = strs[1].toCharArray();

        //进制，可以调为十进制等
        int n = 10;

        List<Integer> list = new ArrayList<>();
        int carry = 0;
        int i,j;
        for(i = a.length - 1, j = b.length - 1; i >= 0 && j >= 0; i --, j--){
            int x = a[i] - '0';
            int y = b[j] - '0';
            int tmp = x + y + carry;
            carry = 0;
            if(tmp >= n){
                list.add(tmp - n);
                carry = 1;
            }else{
                list.add(tmp);
            }
        }

        if(i >= 0){
            for(; i>= 0; i--){
                int x = a[i] - '0';
                int tmp = x + carry;
                carry = 0;
                if(tmp >= n){
                    list.add(tmp - n);
                    carry = 1;
                }else{
                    list.add(tmp);
                }
            }
        }

        if(j >= 0){
            for(; j>= 0; j--){
                int y = b[j] - '0';
                int tmp = y + carry;
                carry = 0;
                if(tmp >= n){
                    list.add(tmp - n);
                    carry = 1;
                }else{
                    list.add(tmp);
                }
            }
        }
        if(carry != 0){
            list.add(carry);
        }

        for(int k = list.size() - 1; k >= 0; k--){
            System.out.print(list.get(k));
        }
        System.out.println();

    }
}
