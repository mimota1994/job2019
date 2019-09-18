package main.leecode;

/**
 * 如果简单类加的话，会超时
 * 可以利用类似二分的思想，比如计算100是几个3相加，我们可以先算100是否在0个3和1个3中间，再看是否在2个3和4个3中间
 * ...
 * 发现是在32和64个3中间
 */

class Solution_29 {

    public static void main(String[] args) {
        Solution_29 s = new Solution_29();
        System.out.println(s.divide(Integer.MIN_VALUE, 1));
        System.out.println(s.divide(10, 3));
        System.out.println(s.divide(Integer.MAX_VALUE, 2));

    }
    public int divide(int dividend, int divisor) {
        if(divisor == 0){
            return Integer.MAX_VALUE;
        }
        long dividendL = dividend;
        long divisorL = divisor;

        boolean isLess = false;

        if(dividendL < 0){
            isLess = isLess ^ true;
            dividendL = 0 - dividendL;
        }

        if(divisorL < 0){
            isLess = isLess ^ true;
            divisorL = 0 - divisorL;
        }

        long leftIndex = 0;
        long rightIndex = 1;
        long left = 0;
        long right = divisorL;

        while(true){
            if(dividendL >= left && dividendL < right){
                break;
            }else{
                leftIndex = rightIndex;
                rightIndex = rightIndex + rightIndex;
                left = right;
                right = right + right;
            }
        }

        long cur = left;
        long curIndex = leftIndex;
        while(cur <= dividendL){
            curIndex ++;
            cur = cur + divisorL;
        }
        long result = curIndex - 1;
        if(isLess){
            result = 0 - result;
        }

        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }else{
            return (int) result;
        }
    }
}