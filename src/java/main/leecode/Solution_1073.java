package main.leecode;

import java.util.ArrayList;
import java.util.List;

public class Solution_1073 {

    public static void main(String[] args) {
        Solution_1073 s = new Solution_1073();
        s.addNegabinary(new int[]{1,0,1}, new int[]{1,0,1});
    }

    public int[] addNegabinary(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int i = arr1.length - 1;
        int j = arr2.length - 1;

        int jin = 0;
        int yu  = 0;
        while(i >= 0 && j >= 0){
            int a = (arr1[i] + arr2[j] + jin);
            if(a >= 2){
                jin = -1;
                yu = a % 2;
            }else if(a < 0){
                jin = 1;
                yu = 1;
            }else{
                jin = 0;
                yu = a;
            }
            list.add(yu);
            i --;
            j --;
        }

        int index = -1;
        int[] array = null;

        if(i >= 0){
            index = i;
            array = arr1;
        }
        if(j >= 0){
            index = j;
            array = arr2;
        }

        while(index >= 0){
            int a = (array[index] + jin);
            if(a >= 2){
                jin = -1;
                yu = 0;
            }else if(a < 0){
                jin = 1;
                yu = 1;
            }else{
                jin = 0;
                yu = a;
            }
            list.add(yu);
            index --;
        }
        if(jin > 0){
            list.add(1);
        }
        if(jin < 0){
            list.add(1);
            list.add(1);
        }

        List<Integer> re = new ArrayList<>();
        boolean isF = true;
        for(int k = list.size() - 1; k >= 0; k--){
            if(list.get(k) == 0 && isF){
                continue;
            }else{
                isF = false;
                re.add(list.get(k));
            }
        }
        if(re.size() == 0){
            return new int[]{0};
        }
        int[] result = new int[re.size()];
        for(int k = 0; k < re.size(); k ++){
            result[k] = re.get(k);
        }
        return result;
    }
    public long toNum(int[] array){
        long num = 0;
        for(int i = 0 ; i < array.length; i++){
            num = num * (-2) + array[i];
        }
        return num;
    }

    public int[] toS(long num){
        List<Integer> list = new ArrayList<>();
        while(num != 0){
            int yu = (int)(num & 1);
            num = (num - yu) / (-2);
            list.add(yu);
        }
        int[] result = new int[list.size()];
        for(int i = list.size() - 1; i >= 0; i--){
            result[list.size() - 1 - i] = list.get(i);
        }
        if(result.length == 0){
            return new int[]{0};
        }
        return result;
    }
}
