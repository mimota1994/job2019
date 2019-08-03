package main.school2019Test.weipinhui;


import java.util.Arrays;
import java.util.Scanner;

//字符串的旋转
//s + s 用来模拟旋转
//要考虑原本就不同的情况
public class Solution_60 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(";");
        if(strs[0].length() != strs[1].length()){
            System.out.println(false);
            return;
        }
        String s = strs[0] + strs[0];
        if(s.contains(strs[1])){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
