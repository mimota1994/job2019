package main.job.kedaxunfei;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        String str = "{11,13,15,17,19,21}";
        str = str.substring(1, str.length() - 1);
        String[] strs = str.split(",");
        int[] array = new int[strs.length];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(strs[i]);
        }
        System.out.println(find(array, 0, array.length - 1));
    }

    public static int find(int[] array, int left, int right){
        if(left > right || left < 0 || left >= array.length || right < 0 || right >= array.length){
            return -1;
        }else{
            int mid = (left + right) / 2;
            if(array[mid] == 19){
                return mid + 1;
            }else if(array[mid] > 19){
                return find(array, left, mid - 1);
            }else{
                return find(array, mid + 1, right);
            }
        }
    }
}
