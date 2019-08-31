package main.job.yuanfudao;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int k = 0; k < n; k++){
            int t = sc.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            for(int i = 0; i < t; i++){
                int tmp = sc.nextInt();
                if(tmp > 0){
                    list.add(tmp);
                }
            }
            int sum = 0;


            while(list.size() >= 3){
                list.sort((a,b) -> b - a);
                int a = list.poll();
                int b = list.poll();
                int c = list.poll();
                int min = Integer.MAX_VALUE;
                if(a < min){
                    min = a;
                }
                if(b < min){
                    min = b;
                }
                if(c < min){
                    min = c;
                }
                sum += min;
                a = a - min;
                b = b - min;
                c = c - min;
                if(a > 0){
                    list.add(a);
                }
                if(b > 0){
                    list.add(b);
                }
                if(c > 0){
                    list.add(c);
                }
            }
            System.out.println(sum);
        }
    }
}
