package main.leecode;

public class TrieNode{
    TrieNode[] links;
    boolean isEnd = false;

    TrieNode(){
        links = new TrieNode[26];
    }

    void setNext(char c){
        links[c - 'a'] = new TrieNode();
    }

    TrieNode next(char c){
        return links[c - 'a'];
    }

    boolean containNextKey(char c){
        return links[c - 'a'] != null;
    }
    void setEnd(){
        this.isEnd = true;
    }

    boolean isEnd(){
        return isEnd;
    }
}
