package main.school2019Test.yuanfudao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Solution_64 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int group = n / m;

        int rest = n % m;

        Stack<List<Integer>> stack = new Stack<>();
        for(int i = 0; i < group; i ++){
            List<Integer> list = new ArrayList<>();
            for(int j =0; j < m; j ++){
                list.add(sc.nextInt());
            }
            stack.push(list);
        }


        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < rest; i++){
            list.add(sc.nextInt());
        }

        if(!list.isEmpty()){
            stack.push(list);
        }

        while(!stack.isEmpty()){
            stack.pop().forEach(str -> System.out.print(str + " "));
        }



    }
}
