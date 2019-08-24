package main.school2019Test.xiaomi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 求数列第n项
 * 米兔从兔米那里了解到有一个无限长的数字序列 1,  2，3，3，4，4，4,  5，5，5，5，5 ...,
 * (已知此数列有一定规律，现将这些数字按不同数值堆叠，相同值的数字在同一层)。米兔想知道这个数字序列的第n个数所在的那一层之前的所有层里共有多少个数。
 * solution1
 * 斐波那契的变种
 */
public class Solution_91 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if(n == 1){
            System.out.println(0);
            return;
        }

        if(n == 2){
            System.out.println(1);
            return;
        }
        List<Long> list = new ArrayList<>();
        list.add(1l);
        list.add(1l);
        long sum = 2;
        long tmp = 2;
        int i = 1;
        while(true){
            list.add(list.get(i) + list.get(i - 1));
            i ++;
            sum += list.get(i);
            if(sum >= n){
                System.out.println(tmp);
                return;
            }else{
                tmp = sum;
            }
        }

    }
}
