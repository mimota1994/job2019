package main.school2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//塔
public class Solution_14 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);

        strs = bf.readLine().split(" ");
        List<Tale> array = new ArrayList(n);
        for(int i = 0; i < n; i++){
            array.add(new Tale(i + 1, Integer.parseInt(strs[i])));
        }
        Collections.sort(array, (o1, o2) -> (o2.high - o1.high));

        int m = 0;

        List<String> list = new ArrayList();
        while((array.get(0).high - array.get(n - 1).high) > 1 && m <= k){
            array.get(0).high --;
            array.get(n - 1).high ++;
            list.add(array.get(0).num + " " + array.get(n - 1).num);
            for(int i = 0; i < n; i++){
                if(array.get(0).high > array.get(i).high){
                    Tale tmp = array.get(0);
                    array.set(0, array.get(i - 1));
                    array.set(i - 1, tmp);
                    break;
                }
            }

            for(int i = n -1; i >= 0; i--){
                if(array.get(n - 1).high < array.get(i).high){
                    Tale tmp = array.get(n - 1);
                    array.set(n - 1, array.get(i + 1));
                    array.set(i + 1, tmp);
                    break;
                }
            }
            m ++;
        }
        System.out.println(array.get(0).high - array.get(n - 1).high + " " + m);

        list.forEach(str -> System.out.println(str));


    }


}

class Tale{
    int num;
    int high;

    Tale(int num, int high){
        this.num = num;
        this.high = high;
    }
}
