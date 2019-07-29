package main.school2019.zhaoshang;

import java.util.*;

//重叠的装饰
//80,最后一个用例应该是有问题，这里倒是不卡时间
//可以优化，不需要这么多端点，但是如何寻找是一个问题
public class Solution_47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] array = new int[n][2];
        int max = 0;
        for(int i = 0; i < n; i ++){
            int[] ints = new int[2];
            String[] strs= sc.nextLine().split(" ");
            ints[0] = Integer.parseInt(strs[0]);
            ints[1] = Integer.parseInt(strs[1]);
            array[i] = ints;
            if(ints[0] > max){
                max = ints[0];
            }
            if(ints[1] > max){
                max = ints[1];
            }
        }

        int[] flag = new int[max + 1];
        for(int i = 0; i < n; i ++){
            int start = array[i][0];
            int stop = array[i][1];
            for(int j = start; j <= stop; j ++){
                flag[j] = i + 1;
            }
        }

        Map map = new HashMap();
        int result = 0;
        for(int i = 0; i < flag.length; i++){
            if(flag[i] != 0 && !map.containsKey(flag[i])){
                result ++;
                map.put(flag[i], 1);
            }
        }

        System.out.println(result);

    }
}
