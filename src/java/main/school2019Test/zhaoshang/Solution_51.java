package main.school2019Test.zhaoshang;

import java.util.Arrays;
import java.util.Scanner;

//目的地最短步数
public class Solution_51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int step = 1;
        int dis = 0;
        while(true){
            dis += step;
            int diff = dis - n;
            if(diff == 0){
                System.out.println(step);
                break;
            }else if(diff > 0){
                if(diff % 2 == 0){
                    System.out.println(step);
                    break;
                }else{
                    dis = dis - 2 * step;
                }
            }
            step ++;
        }

    }
}
