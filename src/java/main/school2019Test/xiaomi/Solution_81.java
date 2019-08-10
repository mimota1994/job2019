package main.school2019Test.xiaomi;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 构建短字符串
 * 给定任意一个较短的子串，和另一个较长的字符串，判断短的字符串是否能够由长字符串中的字符构建出来，且长串中的每个字符只能用一次。
 * solution1
 * 短字符串放在map中，key为字符，value为次数，初始为短字符串中字符出现的次数
 * 遍历长字符串，如果map中存在该字符，就-1
 * 最后遍历map，如果所有的字符对应的value为0及一下，则成立，否则不行
 */
public class Solution_81 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        char[] shortArray = strs[0].toCharArray();
        char[] longArray = strs[1].toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < shortArray.length; i++){
            if(map.containsKey(shortArray[i])){
                map.put(shortArray[i], map.get(shortArray[i]) + 1);
            }else{
                map.put(shortArray[i], 1);
            }
        }

        for(int i = 0; i < longArray.length; i++){
            if(map.containsKey(longArray[i])){
                map.put(longArray[i], map.get(longArray[i]) - 1);
            }
        }

        for(int i : map.values()){
            if(i > 0){
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }

}
