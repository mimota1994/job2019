package main.leecode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + n * i);
            }else{
                map.put(nums[i], i);
            }
        }

        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int tmp = nums[left] + nums[right];
            if(tmp < target){
                left ++;
            }else if(tmp > target){
                right --;
            }else{
                int a = map.get(nums[left]);
                int b = map.get(nums[right]);
                if(a < b){
                    return new int[]{a, b};
                }else if(a > b){
                    return new int[]{b, a};
                }else{
                    a = a / n;
                    b = b % n;
                    return new int[]{a > b ? b : a, a > b ? a : b};
                }
            }
        }

        return null;
    }

}
