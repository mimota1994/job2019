package main.job.unity;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int n = sc.nextInt();
        long[] prices = new long[n];
        for(int i = 0; i < n ; i++){
            prices[i] = sc.nextLong();
        }

        if(n == 0){
            System.out.println(0);
            return;
        }

        long p = 0;
        long save = 0;
        long minPrice = prices[0];
        long maxPrice = prices[0];

        for(int i = 1; i < n; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxPrice = Math.max(maxPrice, prices[i]);
            save = Math.max(save, prices[i] - minPrice - f);
            if(maxPrice - prices[i] >= f){
                p += save;
                save = 0;
                maxPrice = prices[i];
                minPrice = prices[i];
            }
        }
        System.out.println(p + save);
    }
}
