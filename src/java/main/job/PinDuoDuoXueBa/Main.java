package main.job.PinDuoDuoXueBa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        int[] array = new int[strs.length];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(strs[i]);
        }

        strs = bf.readLine().split(" ");
        int[] tmps = new int[strs.length];
        for(int i = 0; i < tmps.length; i++){
            tmps[i] = Integer.parseInt(strs[i]);
        }

        int index = 0;
        if(array[0] >= array[1]){
            index = 0;
        }else if(array[array.length - 1]  <= array[array.length - 2]){
            index = array.length - 1;
        }else{
            for(int i = 1; i < array.length; i++){
                if(array[i] <= array[i - 1]){
                    index = i;
                    break;
                }
            }
        }


        Arrays.sort(tmps);

        if(array.length == 2){
            System.out.println(array[0] + " " + tmps[tmps.length - 1]);
            return;
        }

        int com = -1;
        for(int i = tmps.length - 1; i >= 0; i--){
            if(index == 0){
                if(array[index + 1] > tmps[i]){
                    com = i;
                    break;
                }
            }else if(index == array.length - 1){
                if(array[index - 1] < tmps[i]){
                    com = i;
                    break;
                }
            }else{
                if(array[index - 1] < tmps[i] && array[index + 1] > tmps[i]){
                    com = i;
                    break;
                }
            }
        }

        if(com == -1){
            System.out.println("NO");
        }else{
            String str = "";
            array[index] = tmps[com];
            for(int i = 0; i < array.length; i++){
                str += (array[i] + " ");
            }
            System.out.println(str);
        }


    }


}
