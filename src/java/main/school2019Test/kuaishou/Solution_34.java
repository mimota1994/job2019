package main.school2019Test.kuaishou;

import java.io.IOException;
import java.util.Scanner;


//数字序列第n位的值
public class Solution_34 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int m = (int)Math.ceil((Math.sqrt(1 + 8 * n) - 1) / 2);
        
        System.out.println(m);
  

    }
}
