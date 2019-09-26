package main.leecode;

public class Solution_79 {

    boolean result = false;

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        char[] array = word.toCharArray();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                helper(board, i, j, n, m, array, 0, new boolean[n][m]);
                if(result == true){
                    return true;
                }
            }
        }

        return false;
    }

    public void helper(char[][] board, int i, int j, int n, int m, char[] array, int index, boolean[][] flag){
        if(i < 0 || i >= n || j < 0 || j >= m || flag[i][j] == true || result == true || index >= array.length){
            if(index >= array.length) {
                result = true;
            }
            return;
        }else{
            if(board[i][j] == array[index]){
                flag[i][j] = true;
                helper(board, i + 1, j, n, m, array, index + 1, flag);
                helper(board, i - 1, j, n, m, array, index + 1, flag);
                helper(board, i, j + 1, n, m, array, index + 1, flag);
                helper(board, i, j - 1, n, m, array, index + 1, flag);
                flag[i][j] = false;

            }
        }
    }
}
