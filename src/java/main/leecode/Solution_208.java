package main.leecode;

import java.util.HashSet;
import java.util.Set;

public class Solution_208 {

    public static void main(String[] args) {
        Solution_208 s = new Solution_208();
        s.Trie();
//        s.insert("application");
        s.insert("apd");
        System.out.println();
    }

    TrieNode node = null;

    /** Initialize your data structure here. */
    public void Trie() {
        node = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        char[] array = word.toCharArray();
        TrieNode n = node;
        for(int i = 0; i < array.length; i++){
            if(!n.containNextKey(array[i])){
                n.setNext(array[i]);
            }
            n = n.next(array[i]);
            if(i == array.length - 1){
                n.setEnd();
            }
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        char[] array = word.toCharArray();
        TrieNode n = node;
        for(int i = 0; i < array.length; i++){
            if(!n.containNextKey(array[i])){
                return false;
            }
            n = n.next(array[i]);
        }
        if(n.isEnd()){
            return true;
        }else{
            return false;
        }
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        char[] array = prefix.toCharArray();
        TrieNode n = node;
        for(int i = 0; i < array.length; i++){
            if(!n.containNextKey(array[i])){
                return false;
            }
            n = n.next(array[i]);
        }
        return true;
    }
}

