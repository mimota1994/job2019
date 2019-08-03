package main.school2019Test.youzan;


import java.util.Scanner;

/**
 * 查找k大的元素
 * 直接找三次min不就好了。。。
 */
public class Solution_63 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.substring(1, str.length() - 1).split(",");

        int[] array = new int[strs.length];

        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(strs[i]);
        }

        int a = max(array, -1, -1);
        int b = max(array, a, -1);
        System.out.println(array[max(array, a, b)]);
    }

    public static int max(int[] array, int a, int b){
        int index = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(i != a && i != b && array[i] > max){
                index = i;
                max = array[i];
            }
        }

        return index;
    }
}
