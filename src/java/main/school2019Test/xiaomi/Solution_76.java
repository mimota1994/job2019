package main.school2019Test.xiaomi;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 进制间转换
 * 模拟
 */
public class Solution_76 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        char[] array = strs[0].toCharArray();
        int k = Integer.parseInt(strs[1]);

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< array.length; i++){
            list.add(array[i] - '0');
        }
        List<Integer> result = new ArrayList<>();
        while(!list.isEmpty()){
            boolean isFirst = true;
            List<Integer> tmp = new ArrayList<>();
            int rest = 0;
            for(int i = 0; i < list.size(); i++){
                if(!(((list.get(i) + rest * 10) / k) == 0 && isFirst)){
                    isFirst = false;
                    tmp.add((list.get(i) + rest * 10) / k);
                }
                rest = (list.get(i) + rest * 10) % k;
            }
            result.add(rest);
            list = tmp;
        }

        for(int i = result.size() - 1; i >= 0; i --){
            System.out.print(result.get(i));
        }


    }
}
