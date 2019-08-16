package main.job.kedaxunfei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char[] chars = sc.nextLine().toCharArray();
        String str = "爱讯飞789swr1wwen34ifly65tek";
        char[] chars = str.toCharArray();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < chars.length; i++){
            int a = chars[i] - '0';
            if(a >= 0 && a <= 9){
                list.add(a);
            }
        }

        list.sort(null);

        if(list.size() == 0){
            System.out.println( -1);
            return;
        }
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}