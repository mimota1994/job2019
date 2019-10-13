package main.leecode;

import java.util.*;

public class Solution_241 {

    List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        Solution_241 s = new Solution_241();
        Object o = s.diffWaysToCompute("2*3-4*5");
        System.out.println();
    }

    public List<Integer> diffWaysToCompute(String input) {
//        String[] strs = input.split("\\+|-|\\*|/");
//        List<Integer> nums = new LinkedList<>();
//        for(int i = 0; i < strs.length; i++){
//            nums.add(Integer.parseInt(strs[i]));
//        }
//        List<Character> coms = new LinkedList<>();
//        for(int i = 0; i < input.length(); i++){
//            char c = input.charAt(i);
//            if(c == '+' || c == '-' || c == '*' || c == '/'){
//                coms.add(c);
//            }
//        }
//        helper(nums, coms);
        return partition(input);
    }

    public List<Integer> partition(String str) {
        List<Integer> result = new ArrayList<>();
        boolean flag = true;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '+' || c == '-' || c == '*'){
                flag = false;
                List<Integer> tmp1 = partition(str.substring(0, i));
                List<Integer> tmp2 = partition(str.substring(i + 1, str.length()));
                for(int a : tmp1){
                    for(int b : tmp2){
                        if(c == '+'){
                            result.add(a + b);
                        }else if(c == '-'){
                            result.add(a - b);
                        }else if(c == '*'){
                            result.add(a * b);
                        }
                    }
                }
            }
        }
        if(flag){
            result.add(Integer.parseInt(str));
        }
        return result;

    }
    public void helper(List<Integer> nums, List<Character> coms){
        if(nums.size() == 1){
            result.add(nums.get(0));
        }else{
            for(int i = 0; i < coms.size(); i++){
                List<Integer> tmpNums = new LinkedList<>(nums);
                List<Character> tmpComs = new LinkedList<>(coms);
                convert(tmpNums, tmpComs, i);
                helper(tmpNums, tmpComs);
            }
        }
    }



    public void convert(List<Integer> nums, List<Character> coms, int i){
        char c = coms.remove(i);
        int a = nums.remove(i);
        int b = nums.remove(i);
        if(c == '*'){
            nums.add(i, a * b);
        }else if(c == '/'){
            nums.add(i, a / b);
        }else if(c == '+'){
            nums.add(i, a + b);
        }else{
            nums.add(i, a - b);
        }
    }
}
