package main.leecode;

public class LCP_1 {

    public int game(int[] guess, int[] answer) {

        int num = 0;
        int n = guess.length > answer.length ? answer.length : guess.length;

        for(int i = 0; i < n; i++){
            if(guess[i] == answer[i]){
                num ++;
            }
        }
        return num;
    }
}
