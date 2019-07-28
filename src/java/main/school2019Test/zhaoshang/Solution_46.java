package main.school2019Test.zhaoshang;

import java.util.Scanner;

//推到骨牌
public class Solution_46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.nextLine().toCharArray();
        int start = 0;
        String str = "";
        for(int i = 0; i < array.length; i++){
            int length = i - start + 1;
           if(array[i] == 'L'){
                if(array[start] == '.'){
                    str = addString(str, 'L', length);
                }else if(array[start] == 'R'){
                    if(length % 2 == 0){
                        str = addString(str, 'R', length / 2);
                        str = addString(str, 'L', length / 2);
                    }else{
                        str = addString(str, 'R', length / 2);
                        str = addString(str, '.', 1);
                        str = addString(str, 'L', length / 2);
                    }
                }else{
                    str = addString(str, 'L', 1);
                }
                start = i + 1;
            }else if(array[i] == 'R'){
               if(array[start] == 'R'){
                   str = addString(str, 'R', length - 1);
               }else if(array[start] == '.'){
                   str = addString(str, '.', length - 1);
               }
               start = i;
            }
        }
        if(start >= array.length){

        }else if(array[start] == 'R'){
            str = addString(str, 'R', array.length - start );
        }else{
            str = addString(str, '.', array.length - start );
        }
        System.out.println(str);
    }

    public static String addString(String str, char c, int length){
        String tmp = String.valueOf(c);
        for(int i = 0; i < length; i++){
            str += tmp;
        }

        return str;
    }
}
