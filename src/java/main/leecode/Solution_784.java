package main.leecode;

import java.util.LinkedList;
import java.util.List;

public class Solution_784 {

    public static void main(String[] args) {
        Solution_784 s = new Solution_784();
        s.letterCasePermutation("a1b2");
    }

    List<String> list = new LinkedList<>();

    public List<String> letterCasePermutation(String S) {

        helper(S.toCharArray(), 0);
        return list;
    }

    public void helper(char[] array, int index){
        if(index >= array.length){
            list.add(new String(array));
        }else{
            if(isBigLetter(array[index])){
                helper(array, index + 1);
                array[index] = (char)(array[index] + 32);
                helper(array, index + 1);
                array[index] = (char)(array[index] - 32);
            }else if(isSmallLetter(array[index])){
                helper(array, index + 1);
                array[index] = (char)(array[index] - 32);
                helper(array, index + 1);
                array[index] = (char)(array[index] + 32);
            }else{
                helper(array, index + 1);
            }
        }
    }

    public boolean isBigLetter(char c){
        if(c >= 'A' && c <= 'Z'){
            return true;
        }else{
            return false;
        }
    }

    public boolean isSmallLetter(char c){
        if(c >= 'a' && c <= 'z'){
            return true;
        }else{
            return false;
        }
    }
}
