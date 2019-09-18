package main.leecode;

public class Solution_36 {
    public boolean isValidSudoku(char[][] board) {

        //从上往下检查,从左往右检查
        for(int i = 0; i < 9; i++){
            int[] flag1 = new int[10];
            int[] flag2 = new int[10];
            int[] flag3 = new int[10];

            for(int j = 0; j < 9;j ++){
                if(board[i][j] - '0' >= 0 && board[i][j] - '0' <= 9){
                    flag1[board[i][j] - '0'] ++;
                }

                if(board[j][i] - '0' >= 0 && board[j][i] - '0' <= 9){
                    flag2[board[j][i] - '0'] ++;
                }

                if(board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3] - '0' >= 0 && board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3] - '0' <= 9){
                    flag3[board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3] - '0'] ++;
                }
            }
            for(int j = 1; j < 10; j++){
                if(flag1[j] > 1 || flag2[j] > 1 || flag3[j] > 1){
                    return false;
                }
            }
        }

        return true;
    }
}
