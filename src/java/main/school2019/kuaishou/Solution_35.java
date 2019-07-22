package main.school2019.kuaishou;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


//a/b
public class Solution_35 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int m = (int)Math.ceil((Math.sqrt(1 + 8 * n) - 1) / 2);
        
        System.out.println(m);
  

    }
}
