package main.leecode;

public class Solution_169 {

    public int majorityElement(int[] nums) {


        int n = nums.length;

        int num = 1;
        int son = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] == son){
                num ++;
            }else{
                num --;
                if(num <= 0){
                    son = nums[i];
                    num = 1;
                }
            }
        }

        return son;
    }
}
