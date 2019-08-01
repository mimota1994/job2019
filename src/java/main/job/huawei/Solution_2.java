package main.job.huawei;

import java.util.Scanner;

public class Solution_2 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String s1;
            String s2;

            for(int i = 0; i < 3; i++){
                s1 = sc.nextLine();
                s2 = sc.nextLine();
                s1 = s1 + s1;
                if(s1 != null){
                    if(s1.contains(s2)){
                        System.out.print(1);
                    }else{
                        System.out.print(0);
                    }
                }else{
                    System.out.print(0);
                }
            }
        }catch (Exception e){
            System.out.print(0);
        }
    }
}
