package main.leecode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution_60 {

    int k = 0;

    String result = "";

    int depth = 0;

    public static void main(String[] args) {
        Solution_60 s = new Solution_60();
        System.out.println(s.getPermutation(3,2));
        System.out.println(s.helper(3,2));
    }


    public String getPermutation(int n, int k) {
        this.k = k;

        helper(n, 0, new boolean[n + 1], new char[n]);
        return result;

    }

    public String helper(int n, int k){
        LinkedList<Integer> list = new LinkedList<>();     //存放剩下的候选数字
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        List<Integer> arr = new ArrayList<>(n);
        int index = 1;
        while(k > 0 && index < n){
            int temp = jie(n - index);
            index ++;
            int i = (int)Math.ceil(k / (double)temp) - 1;
            arr.add(list.remove(i));
            k = k - i * temp;
        }
        arr.addAll(list);
        StringBuilder s = new StringBuilder();
        for(int i : arr){
            s.append(i);
        }
        return s.toString();
    }

    public int jie(int i){
        int result = 1;
        while(i > 1){
            result = result * i;
            i --;
        }
        return result;
    }

    public void helper(int n, int index, boolean[] flag, char[] array){
        if(depth >= k){
            return;
        }
        if(index >= n){
            depth ++;
            if(depth == k){
                result = new String(array);
            }
        }else{
            for(int i = 1; i < flag.length; i++){
                if(flag[i] ==false){
                    flag[i] = true;
                    array[index] = (char)(i + '0');
                    helper(n, index + 1, flag, array);
                    flag[i] = false;
                }
            }
        }
    }
}
