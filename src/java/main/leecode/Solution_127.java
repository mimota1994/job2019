package main.leecode;

import java.util.ArrayList;
import java.util.List;

public class Solution_127 {
    public static void main(String[] args) {
        Solution_127 s = new Solution_127();
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        System.out.println(s.ladderLength("hit","cog", wordList));


    }
    static int min = Integer.MAX_VALUE;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        helper(beginWord, endWord, wordList, 0);
        if(min == 0){
            return min;
        }else{
            return min + 1;
        }
    }

    public void helper(String beginWord, String endWord, List<String> wordList, int depth){
        if(!wordList.contains(endWord)){
            return;
        }else if(beginWord == endWord){
            min = Math.min(min, depth);
            return;
        }else{
            wordList.remove(beginWord);
            List<String> list = new ArrayList<>();
            for(String str : wordList){
                if(dect(str, beginWord)){
                    list.add(str);
                }
            }
            if(list.isEmpty()){
                return;
            }else{
                for(String str : list){
                    helper(str, endWord, wordList, depth + 1);
                }
            }
        }
    }

    public boolean dect(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }else{
            int num = 0;
            for(int i = 0; i < str1.length(); i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    num ++;
                    if(num > 1){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
