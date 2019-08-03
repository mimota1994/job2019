package main.school2019Test.wangyihuyu;

import java.util.Scanner;

/**
 * 时钟
 */
public class Solution_66 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();

        for(int i = 0; i < n; i++){
            String[] strs = sc.nextLine().split(":");
            int hour = Integer.parseInt(strs[0]);
            int minu = Integer.parseInt(strs[1]);
            int sec = Integer.parseInt(strs[2]);

            if(hour >= 24){
                hour = hour % 10;
            }

            if(minu >= 60){
                minu = minu % 10;
            }

            if(sec >= 60){
                sec = sec % 10;
            }

            System.out.printf("%02d:%02d:%02d", hour, minu, sec);
            System.out.println();
        }


    }

    public static void spaceHelper(int x){
        for(int i = 0; i < x; i++){
            System.out.print(" ");
        }
    }
}
