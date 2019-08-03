package main.school2019Test.youzan;


import java.util.Scanner;

/**
 * 数组的移动跳跃
 * 有一个辅助数组，记录是否走过该位置
 * 如果走过，那么就跳不出去了
 * 如果不用辅助空间如何完成呢？
 * 其实就是利用本身数组记录
 */
public class Solution_61 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strs = str.substring(1, str.length() - 1).split(",");

        int[] array = new int[strs.length];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(strs[i]);
        }

        int i = 0;

        while(true){
            if(array[i] == 0){
                System.out.println(false);
                return;
            }else{
                int tmp = array[i];
                array[i] = 0;
                i = i + tmp;

                if(i >= array.length || i < 0){
                    System.out.println(true);
                    return;
                }
            }
        }



    }
}
