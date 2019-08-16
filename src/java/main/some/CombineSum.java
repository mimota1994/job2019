package main.some;

import java.util.LinkedList;
import java.util.List;

public class CombineSum {

    public static void combineSum(int[] array, int index, int target, List<Integer> temp, List<List<Integer>> result){
        if(target < 0){
            return;
        }else if(target == 0){
            result.add(new LinkedList<>(temp));
        }else{
            for(int i = index; i < array.length; i++){
                temp.add(array[i]);
                combineSum(array, i, target - array[i], temp, result);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void combineSum2(int[] array, int index, int target, List<Integer> temp, List<List<Integer>> result){
        if(target < 0){
            return;
        }else if(target == 0){
            result.add(new LinkedList<>(temp));
        }else{
            for(int i = index; i < array.length; i++){
                if(i > index && array[i] == array[i - 1]) continue;

                temp.add(array[i]);
                combineSum2(array, i + 1, target - array[i], temp, result);
                temp.remove(temp.size() - 1);

            }
        }
    }

    public static void combineSum3(int[] array, int index, int target, int k, List<Integer> temp, List<List<Integer>> result){
        if(k < 0 || target < 0){
            return;
        }else if(target == 0 && k == 0){
            result.add(new LinkedList<>(temp));
        }else{
            for(int i = index; i < array.length; i++){
                temp.add(array[i]);
                combineSum3(array, i + 1, target - array[i], k - 1, temp, result);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static int combinationSum4(int[] nums, int target) {
        int[] dp=new int[target+1];
        for(int i=1;i<dp.length;i++){
            for(int num:nums){
                if (num == i) dp[i]++;
                else if (num < i) dp[i] += dp[i-num];
                else break;
            }
        }
        return dp[target];
    }

    /**
     * 对于一个不重复的数组，给定一个值，找到所有可能的组成该值的个数，数组中的元素可以重复使用
     * solution1:
     * dp
     * dp[i] = dp[i] + dp[i - nums[j]]
     * 我们并不是直接找target，而是从1开始找，先找组成1的所有可能性，再找组成2的所有可能性...直到找到target
     * 组成n的可能性，需要遍历原来的数组，简单来说，就是原来数组中比n小的数字，都可能是组成n的最后一个数字，那么就要加上dp[i - nums[j]]
     * 这里要判断一下nums[j] >= i - nums[j]
     * @param nums
     * @param target
     * @return
     */
    public static int combinationSum5(int[] nums, int target){
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++){
            for(int j = 0; j < nums.length && nums[j] <= i; j++){
                if(nums[j] >= i - nums[j]){
                    dp[i] = dp[i] + dp[i - nums[j]];
                }
            }
        }

        return dp[target];
    }

}
