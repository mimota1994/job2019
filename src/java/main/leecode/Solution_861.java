package main.leecode;

public class Solution_861 {

    public static void main(String[] args) {
        Solution_861 s = new Solution_861();
        int[][] matrix = new int[][]{{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        s.matrixScore(matrix);
    }

    public int matrixScore(int[][] A) {
        int row = A.length;
        int col = A[0].length;

        while(true){
            boolean needNext = false;
            for(int i = 0; i < row; i++){
                if(A[i][0] == 0){
                    needNext = true;
                    for(int j = 0; j < col; j++){
                        A[i][j] = A[i][j] == 1 ? 0 : 1;
                    }
                }
            }
            for(int j = 0; j < col; j++){
                int num = 0;
                for(int i = 0; i < row; i++){
                    if(A[i][j] == 0){
                        num ++;
                    }
                }
                if(num > (row / 2)){
                    needNext = true;
                    for(int i = 0; i < row; i++){
                        A[i][j] = A[i][j] == 1 ? 0 : 1;
                    }
                }
            }
            if(!needNext){
                break;
            }
        }
        int sum = 0;
        for(int i = 0; i < row; i++){
            int num = 0;
            for(int j = 0; j < col; j++){
                num = (num << 1) + A[i][j];
            }
            sum += num;
        }
        return sum;
    }

}
