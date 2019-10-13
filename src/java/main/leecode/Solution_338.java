package main.leecode;

public class Solution_338 {

    public int[] countBits(int num) {
        int[] array = new int[num + 1];
        for(int i = 0; i <= num; i++){
            array[i] = dis(i);
        }
        return array;
    }

    public int dis(int n){
        int num = 0;
        while(n != 0){
            if((n & 1) == 1){
                num ++;
            }
            n = n >> 1;
        }
        return num;
    }

    public int[] countBits(int num, boolean flag) {
        int[] array = new int[num + 1];
        array[0] = 0;
        int left = 1;
        int high = 2;

        while(high <= num + 1){
            int k = 0;
            for(int i = left; i < high && i <= num; i++){
                array[i] = array[k ++] + 1;
            }
            left = left << 1;
            high = high << 1;
        }

        return array;
    }
}
