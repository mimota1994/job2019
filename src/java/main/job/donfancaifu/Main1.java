package main.job.donfancaifu;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        if(helper(strs[0], strs[1], strs[2])){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }

    }
    public  static boolean helper(String s1, String s2, String s3) {
        boolean[][] table = new boolean[s1.length()+1][s2.length()+1];
        for(int i=0; i<s1.length()+1; i++){
            for(int j=0; j< s2.length()+1; j++){
                if(i==0 && j==0){
                    table[i][j] = true;
                } else if(i == 0){
                    table[i][j] = ( table[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1));
                }
                else if(j == 0){
                    table[i][j] = ( table[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1));
                } else{
                    table[i][j] = (table[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1) ) || (table[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1));
                }
            }
        }
        return table[s1.length()][s2.length()];
    }
}