package main.school2019Test.wangyihuyu;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * 会话列表
 */
public class Solution_67 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i ++){
            int n = sc.nextInt();
            LinkedHashMap<Integer, Integer> lru = new LinkedHashMap(16, 0.75f, true);
            int index = 0;
            for(int j = 0; j < n; j++){
                lru.put(sc.nextInt(), 1);
            }
            Object[] array = lru.keySet().toArray();
            for(int j = array.length - 1; j >=0; j --){
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }
}
