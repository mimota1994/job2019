package main.leecode;

public class Solution_1021 {

    public String removeOuterParentheses(String S) {
        int i = 0;
        boolean isFirst = true;
        int leftNum = 0;
        StringBuilder sp = new StringBuilder();
        while(i < S.length()){
            if(S.charAt(i) == '(' && isFirst == true){
                isFirst = false;
            }else if(S.charAt(i) == ')' && leftNum == 0){
                isFirst = true;
            }else if(S.charAt(i) == '('){
                leftNum ++;
                sp.append('(');
            }else if(S.charAt(i) == ')'){
                leftNum --;
                sp.append(')');
            }
            i ++;
        }

        return sp.toString();
    }
}
