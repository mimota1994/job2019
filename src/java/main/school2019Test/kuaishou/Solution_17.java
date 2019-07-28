package main.school2019Test.kuaishou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//满二叉树转化为求和树
public class Solution_17 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        bf.readLine();

        int[] array = new int[strs.length];
        for(int i = 0; i  < strs.length; i++){
            array[i] = Integer.parseInt(strs[i]);
        }

        if(((array.length + 1) & array.length) != 0){
            System.out.println("0 0 0 0 0");
            return;
        }

        transfer(array, 0, array.length - 1);

    }

    public static void transfer(int[] array, int start, int end){
        if(start >= end){
            System.out.print(0 + " ");
        }else{
            transfer(array, start + 1, (start + end) / 2);
            int re = 0;
            for(int i = start + 1; i <= end; i++){
                re = re + array[i];
            }
            System.out.print(re + " ");
            transfer(array, (start + end) / 2 + 1, end);
        }

    }
}
//
//class Node{
//    int val;
//    Node left;
//    Node right;
//
//    Node(int value){
//        this.val = value;
//    }
//}
