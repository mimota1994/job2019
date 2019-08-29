package main.leecode;

public class Solution_289 {

    public static void main(String[] args) {
        Solution_289 s = new Solution_289();
    }

    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                gameOfLife(board, i, j, n, m);
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 2){
                    board[i][j] = 0;
                }else if(board[i][j] == -1){
                    board[i][j] = 1;
                }
            }
        }
    }

    public void gameOfLife(int[][] board, int row, int col, int n, int m){
        int liveSum = 0;
        int deadSum = 0;
        int tmp_row = -1;
        int tmp_col = -1;
        //左上
        tmp_row = row - 1;
        tmp_col = col - 1;
        if(tmp_row >= 0 && tmp_col >= 0){
            if(board[tmp_row][tmp_col] > 0){
                liveSum ++;
            }else{
                deadSum ++;
            }
        }
        //左边
        tmp_row = row;
        tmp_col = col - 1;
        if(tmp_col >= 0){
            if(board[tmp_row][tmp_col]  > 0){
                liveSum ++;
            }else{
                deadSum ++;
            }
        }
        //左下
        tmp_row = row + 1;
        tmp_col = col - 1;
        if(tmp_row < n && tmp_col >= 0){
            if(board[tmp_row][tmp_col] > 0){
                liveSum ++;
            }else{
                deadSum ++;
            }
        }
        //右上
        tmp_row = row - 1;
        tmp_col = col + 1;
        if(tmp_row >= 0 && tmp_col < m){
            if(board[tmp_row][tmp_col] > 0){
                liveSum ++;
            }else{
                deadSum ++;
            }
        }
        //右边
        tmp_row = row;
        tmp_col = col + 1;
        if(tmp_col < m){
            if(board[tmp_row][tmp_col] > 0){
                liveSum ++;
            }else{
                deadSum ++;
            }
        }
        //右下
        tmp_row = row + 1;
        tmp_col = col + 1;
        if(tmp_row < n && tmp_col < m){
            if(board[tmp_row][tmp_col] > 0){
                liveSum ++;
            }else{
                deadSum ++;
            }
        }
        //正上
        tmp_row = row - 1;
        tmp_col = col;
        if(tmp_row >= 0){
            if(board[tmp_row][tmp_col] > 0){
                liveSum ++;
            }else{
                deadSum ++;
            }
        }
        //正下
        tmp_row = row + 1;
        tmp_col = col;
        if(tmp_row < n){
            if(board[tmp_row][tmp_col] > 0){
                liveSum ++;
            }else{
                deadSum ++;
            }
        }
        if(board[row][col] == 1){
            if(liveSum < 2 || liveSum > 3){
                board[row][col] = 2; //2代表活到死
            }
        }else{
            if(liveSum ==  3){
                board[row][col] = -1; //-1代表死到活
            }
        }
    }
}
