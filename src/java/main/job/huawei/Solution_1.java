package main.job.huawei;

import java.util.Scanner;

public class Solution_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        int son = 1;
        int mon = 1;
        double min = Integer.MAX_VALUE;

        int m = 0;
        int n = 0;
        while(mon <= 10000){
            double tmp = (son + 0.0) / mon;
            if(Math.abs(tmp - d) < min){
                m = mon;
                n = son;
                min = Math.abs(tmp - d);
            }
            if (tmp < d) {
                son ++;
            }else if(tmp > d){
                mon ++;
            }else{
                break;
            }
        }

        System.out.println(n + " " + m);
    }
}
