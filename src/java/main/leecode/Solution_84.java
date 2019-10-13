package main.leecode;

import main.job.bigo.Solution;

public class Solution_84 {

    public static void main(String[] args) {
        Solution_84 s = new Solution_84();
        s.largestRectangleArea(new int[]{2,1,5,6,2,3});
    }

    public int largestRectangleArea(int[] heights) {

        int max = 0;
        for(int i = 0; i < heights.length; i++){
            int tmpMax = helper(heights, i);
            max = max > tmpMax ? max : tmpMax;
        }
        return max;

    }

    public int helper(int[] height, int index){
        int high = height[index];
        int left = 0;
        for(int i = index - 1; i >=0; i--){
            if(height[i] >= high){
                left ++;
            }else{
                break;
            }
        }
        int right = 0;
        for(int i = index + 1; i < height.length; i++){
            if(height[i] >= high){
                right ++;
            }else{
                break;
            }
        }
        return high * (left + right + 1);
    }
}
