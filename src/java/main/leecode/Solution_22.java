package main.leecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution_22 {

    List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        Solution_22 s = new Solution_22();
        s.generateParenthesis(4);
        System.out.println();
    }

    public List<String> generateParenthesis(int n) {
        generateParenthesis(n, n, "");
        return result;
    }

    public void generateParenthesis(int n, int k, String str){
        if(n == 0){
            for(int i = 0; i < k; i++){
                str += ")";
            }
            result.add(str);
            return;
        }else{
            generateParenthesis(n - 1, k, str + "(");
            if(n < k){
                generateParenthesis(n, k - 1, str + ")");
            }
        }
    }
}
