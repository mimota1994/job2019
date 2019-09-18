package main.leecode;

import java.util.ArrayList;
import java.util.List;

public class Solution_401 {
    public static void main(String[] args) {
        Solution_401 s = new Solution_401();
        Object o = s.readBinaryWatch(2);
        System.out.println();
    }

    List<String> list = new ArrayList<>();

    public List<String> readBinaryWatch(int num) {

        find(num, new int[10], 0);
        return list;

    }

    public void find(int num, int[] array, int index){
        if(index == 10 || num == 0){
            if(index == 10 && num != 0){
                return;
            }else{
                String str = convert(array);
                if(!str.equals("")){
                    list.add(convert(array));
                }
            }
        }else{
            find(num, array, index + 1);
            array[index] = 1;
            find(num - 1, array, index + 1);
            //array[index] = 0;
        }
    }

    public String convert(int[] array){
        int hour = 0;
        for(int i = 0; i < 4; i++){
            hour = hour * 2 + array[i];
        }
        int min = 0;
        for(int i = 4; i < 10; i++){
            min = min * 2 + array[i];
        }

        if(hour > 11 || min > 59){
            return "";
        }

        if(min < 10){
            return hour + ":0" + min;
        }else{
            return hour + ":" + min;
        }
    }
}
