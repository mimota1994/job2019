package main.school2019Test.xiaomi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个排好序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3, 4, 5, 1, 2}为{1, 2, 3, 4, 5}的一个旋转，该数组的最小值为1。
 *
 * solution1:
 * 直接遍历一遍，如果发现有下降的点，就是该点，要考虑可能并没有旋转
 *
 * solution2:
 * 二分法
 * 假如中间点比左右两个点都大，那么现在往右边
 * 假如中间点比左右都小，那么往左边
 * 不可能出现一大一小
 * 假如中间点比左边大，比右边小，那么就是没有旋转，或者说现在到了一边中
 */
public class Solution_90 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.nextInt());
        }

        helper(list);
    }

    public static void helper(List<Integer> array){
        int left = 0;
        int right = array.size() - 1;
        while(left < right){
            int mid = (left + right) / 2;
            if(array.get(mid) > array.get(right)){
                left = mid + 1;
            }else if(array.get(mid) < array.get(right)){
                right = mid;
            }else{
                right = right -1;
            }
        }

        System.out.println(array.get(left));
    }
}
