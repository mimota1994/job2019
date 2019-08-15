package main.school2019Test.xiaomi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 密码破译
 * solution1
 * 递归
 *
 */
public class Solution_83 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] array = sc.nextLine().toCharArray();
            List<String> list = helper(array, 0);
            for(String str : list){
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }

    public static List<String> helper(char[] array, int index){
        if(index == array.length){
            List<String> list = new ArrayList<>();
            return list;
        }else if(index == array.length - 1){
            List<String> list = new ArrayList<>();
            if(array[index] == '0'){
                return list;
            }
            list.add(String.valueOf((char)(array[index] - '1' + 'a')));
            return list;
        }else if(array[index] != '0'){
            int tmp = (array[index + 1] - '0') + (array[index] - '0') * 10;
            List<String> list1 = helper(array, index + 1);
            char a = (char)(array[index] - '1' + 'a');
            String str = String.valueOf(a);
            for(int i = 0; i < list1.size(); i++){
                list1.set(i, str + list1.get(i));
            }
            if(tmp <= 26){
                List<String> list2 = helper(array, index + 2);
                char b = (char)(tmp + 'a' - 1);
                str = String.valueOf(b);
                if(list2.isEmpty()){
                    list2.add(str);
                }else{
                    for(int i = 0; i < list2.size(); i++){
                        list2.set(i, str + list2.get(i));
                    }
                }
                list1.addAll(list2);
            }
            return list1;
        }else{
            return new ArrayList<>();
        }
    }
}
