package main.job.mk360;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> num1 = new LinkedList<>();
        List<Integer> num2 = new LinkedList<>();
        for(int i = 0; i < n; i++){
            num1.add(sc.nextInt());
        }
        for(int i = 0; i < n; i++){
            num2.add(sc.nextInt());
        }
        List<Integer> list = new ArrayList<>();
        while(!num1.isEmpty() && !num2.isEmpty()){
            int t1 = -1;
            int t2 = -1;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < num1.size(); i++){
                for(int j = 0; j < num2.size(); j ++){
                    int tmp = Math.abs((num1.get(i) + num2.get(j)) % m - m);
                    if(tmp < min){
                        t1 = i;
                        t2 = j;
                        min = tmp;
                    }
                }
            }
            list.add((num1.get(t1) + num2.get(t2)) % m);
            num1.remove(t1);
            num2.remove(t2);
        }
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
