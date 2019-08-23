package main.job.unity;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");

        char[] array2 = strs[1].toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i< array2.length; i++){
            if(map.containsKey(array2[i])){
                map.put(array2[i], map.get(array2[i]) + 1);
            }else{
                map.put(array2[i], 1);
            }
        }

        char[] array1 = strs[0].toCharArray();
        for(int i = 0; i < array1.length; i++){
            if(map.containsKey(array1[i]) && map.get(array1[i]) > 0){
                map.put(array1[i], map.get(array1[i]) - 1);
            }else{
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
