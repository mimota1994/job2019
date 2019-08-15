package main.school2019Test.xiaomi;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 找球
 * 一组带数字编号的球里除了两个编号之外，其它的编号都出现了两次。
 * 请写程序找出这两个只出现一次的编号。要求时间复杂度是O(n)，空间复杂度是O(1)。
 * solution1
 * 异或所有的值可以找到这两个不一样的数字的异说值
 * 然后随便根据异或值得某一位，将数字分为两边，两边分别异或就是最终得值
 * 因为一样得数字，某一位得值肯定相同，而这两个不一样得值肯定会被分到不同得组，因为这是根据他们异或得某一位来划分得
 */
public class Solution_89 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp;
        List<Integer> list = new ArrayList<>();
        while(!(temp = br.readLine()).equals("")) {
            list.add(Integer.parseInt(temp));
        }

        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum = sum ^ list.get(i);
        }

        sum = sum | sum >> 1;
        sum = sum | sum >> 2;
        sum = sum | sum >> 4;
        sum = sum | sum >> 8;
        sum = sum + 1;
        sum = sum >> 1;

        int part1 = 0;
        int part2 = 0;
        for(int i = 0; i < list.size(); i++){
            if((list.get(i) & sum) == 0){
                part1 = part1 ^ list.get(i);
            }else{
                part2 = part2 ^ list.get(i);
            }
        }

        int max = part1 > part2 ? part1 : part2;
        int min = part1 > part2 ? part2 : part1;

        System.out.println(min + " " + max);
    }
}
