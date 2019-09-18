package main.leecode;

public class Solution_55 {
    public boolean canJump(int[] nums) {
        int n = nums.length;

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < i) {
                return false;
            } else {
                int tmp = i + nums[i];
                max = max > tmp ? max : tmp;
                if (max >= n - 1) {
                    return true;
                }
            }
        }

        return true;
    }

}
