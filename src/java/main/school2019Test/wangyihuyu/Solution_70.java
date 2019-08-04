package main.school2019Test.wangyihuyu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 糖果谜题
 * 首先排序
 * 再根据同样的人数来判断
 */
public class Solution_70 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");

        int[] array = new int[strs.length];
        for(int i = 0; i < strs.length; i++){
            array[i] = Integer.parseInt(strs[i]);
        }

        Arrays.sort(array);

        int sum = 0;
        int index = 0;
        while(index < array.length){
            int num = array[index];
            sum += (num + 1);
            int tmp = index;
            while(tmp < array.length && (tmp - index) <= num && array[tmp] == num){
                tmp ++;
            }
            index = tmp;
        }
        System.out.println(sum);

    }
}
