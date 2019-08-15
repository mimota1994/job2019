package main.school2019Test.xiaomi;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 资产包打包
 * 在金融资产交易中，经常涉及到资产包的挑选打包。在资产包打包过程中，每种类型的资产有固定的数量与价值，需选择某几种资产打包，使得资产包总价值最大。
 * 打包时每种资产只能整体打包，不能分割。假设现有可容纳M条资产的资产包，另外有N种资产。资产Na数量为Ta条，总价值为Va元；资产Nb数量为Tb条，总价值为Vb元；资产Nc数量为Tc条，总价值为Vc元......；
 * 资产Nn数量为Tn，总价值为Vn。编写算法，挑选哪些类型资产放入资产包可使得资产包总价值最大？
 * 典型的01背包问题
 * solution1
 * dp f(i, v) 代表前i的物品，正好放v空间下的最大收益
 * f(i, v) = max(f(i - 1, v)， f(i - 1, v - weight[i]) + money[i])
 * 因为第i个物品有两种可能
 * 不放入背包，那么f(i, v) 和i就没有关系了，而是由前i - 1个决定的
 * 放入背包，那么收益为f(i - 1, v - weight[i]) + money[i]，因为v空间已经有weight[i])被占据了，前i - 1个物品只有v - weight[i])个空间
 */
public class Solution_79 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(",");
        int limit = Integer.parseInt(strs[0]);
        int n =  Integer.parseInt(strs[1]);
        int[][] array = new int[n][2];
        String[] strs1 = strs[2].split(" ");
        String[] strs2 = strs[3].split(" ");
        for(int i = 0; i < n; i++){
            array[i][0] = Integer.parseInt(strs1[i]);
        }
        for(int i = 0; i < n; i++){
            array[i][1] = Integer.parseInt(strs2[i]);
        }

        int[][] dp = new int[n][limit + 1];

        for(int j = 1; j <= limit; j ++){
            if(j >= array[0][0]){
                dp[0][j] = array[0][1];
            }

        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j <= limit; j ++){
                int com1 = dp[i - 1][j];
                int com2 = 0;
                if(j - array[i][0] >= 0){
                    com2 = dp[i - 1][j - array[i][0]] + array[i][1];
                }
                dp[i][j] = Math.max(com1, com2);
            }
        }

        int max = 0;
        for(int j = 0; j <= limit; j++){
            if(dp[n - 1][j] > max){
                max = dp[n - 1][j];
            }
        }
        System.out.println(max);



    }


}
