package main.huawei;

import java.util.Scanner;


//汽水瓶子
public class Solution_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            if(n == 0){
                break;
            }
            int sum = 0;
            int reminder = n;
            while(reminder >= 2){
                if(reminder == 2){
                    sum ++;
                    break;
                }else{
                    int cup = (reminder / 3);
                    sum += cup;
                    reminder = reminder % 3 + cup;
                }
            }
            System.out.println(sum);
        }
    }
}
