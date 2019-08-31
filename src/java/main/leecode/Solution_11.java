package main.leecode;

public class Solution_11 {

    public static void main(String[] args) {
        Solution_11 s = new Solution_11();
        System.out.println(s.maxArea(new int[]{2,3,10,5,7,8,9}));
    }

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int max = (right - left) * (Math.min(height[right], height[left]));
        while(left < right){
            if(height[left] < height[right]){
                left ++;
            }else{
                right --;
            }

            if(left < right){
                int tmp = (right - left) * (Math.min(height[right], height[left]));
                max = Math.max(max, tmp);
            }
        }

        return max;
    }
}
