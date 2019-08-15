package main.school2019Test.xiaomi;


        import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

/**
 * 序列的模式匹配
 * solution1
 * 暴力匹配
 *
 */
public class Solution_82 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            while(sc.hasNext()){
                String[] strs = sc.nextLine().split(" ");
                char[] array1 = strs[0].toCharArray();
                char[] array2 = strs[1].toCharArray();

                int i = 0;
                int j = 0;

                int min = Integer.MAX_VALUE;
                int min_left = -1;
                int min_right = -1;

                int left = -1;
                int right = -1;
                while(i < array1.length){
                    if(array1[i] == array2[j] && left == -1 && j != array2.length - 1) {
                        left = i;
                        i++;
                        j++;
                    }else if(array1[i] == array2[j]  && j == array2.length - 1){
                        if(left == -1){
                            left = i;
                        }
                        right = i;
                        if(right - left < min){
                            min = right - left;
                            min_left = left;
                            min_right = right;
                        }
                        i = left + 1;
                        j = 0;
                        left = -1;
                        right = -1;
                    }else if(array1[i] == array2[j]){
                        i ++;
                        j ++;
                    }else{
                        i ++;
                    }
                }
                System.out.println(min_left + " " + min_right);
            }
    }
}
