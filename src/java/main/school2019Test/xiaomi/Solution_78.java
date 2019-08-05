package main.school2019Test.xiaomi;


import java.util.Scanner;

/**
 * 最小立方数之和
 * 拆为立方数29825 结果为9,应该为4
 *
 */
public class Solution_78 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = k;
        int sum = 0;
        while(n > 1){
            int tmp = (int)Math.pow(n, 1.0 / 3);
            tmp = tmp * tmp * tmp;
            sum += (n / tmp);
            n = n % tmp;
        }

        if(n == 1){
            sum ++;
        }
        System.out.println(sum);


        System.out.println(helper(k));

    }

    public static int helper(int n){
        if(n <= 7){
            return n;
        }
        int tmp = (int)Math.pow(n, 1.0 / 3);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= tmp; i ++){
            int a = i * i * i;
            int b = helper(n - a);
            if((b + 1) < min){
                min = (b + 1);
            }
        }
        return min;
    }
}
