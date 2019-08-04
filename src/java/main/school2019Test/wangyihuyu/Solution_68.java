package main.school2019Test.wangyihuyu;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * 字符迷阵
 */
public class Solution_68 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i ++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            sc.nextLine();

            char[][] matrix = new char[m][n];

            for(int j = 0; j < m; j ++){
                matrix[j] = sc.nextLine().toCharArray();
            }

            char[] word = sc.nextLine().toCharArray();
            int sum = 0;
            for(int j = 0; j < m; j ++){
                for(int k = 0; k < n; k++){
                    sum += determine(matrix, j, k, word);
                }
            }
            System.out.println(sum);
        }

    }

    public static int determine(char[][] matrix, int row, int col, char[] word){
        int num = 0;
        //先判断右边
        if((matrix[row].length - col) >= word.length){
            boolean flag = true;
            for(int k = 0; k < word.length; k++){
                if(matrix[row][col + k] != word[k]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                num ++;
            }
        }

        //再判断下面
        if((matrix.length - row) >= word.length){
            boolean flag = true;
            for(int k = 0; k < word.length; k++){
                if(matrix[row + k][col] != word[k]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                num ++;
            }
        }

        //再判断斜边
        if((matrix.length - row) >= word.length && (matrix[row].length - col) >= word.length){
            boolean flag = true;
            for(int k = 0; k < word.length; k++){
                if(matrix[row + k][col + k] != word[k]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                num ++;
            }
        }
        return num;
    }
}
