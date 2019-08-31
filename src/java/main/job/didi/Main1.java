package main.job.didi;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] strs = sc.nextLine().split(" ");

        LinkedList<String> list = new LinkedList<>();
        for(int i = 0; i < strs.length; i++){
            list.add(strs[i]);
        }

        int notMove = calcute(list);
        for(int i = 0; i <= list.size() - 1; i = i + 2){
            for(int j = list.size() - 1; j >= i + 2; j = j - 2){
                if(Integer.parseInt(list.get(j)) < Integer.parseInt(list.get(j - 2))){
                    String tmp = list.get(j);
                    list.set(j, list.get(j - 2));
                    list.set(j - 2, tmp);
                    int a = calcute(list);
                    if(a != notMove){
                        tmp = list.get(j);
                        list.set(j, list.get(j - 2));
                        list.set(j - 2, tmp);
                    }
                }
            }
        }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }


    public static int calcute(List<String> tmp){

        List<String> list = new LinkedList(tmp);
        for(int i = 0; i < list.size(); i++){
            if(i < list.size() && list.get(i).equals("*")){
                cal(list, i, "*");
                i = 0;
            }else if(i < list.size() && list.get(i).equals("/")){
                cal(list, i, "/");
                i = 0;
            }
        }

        for(int i = 0; i < list.size(); i++){
            if(i < list.size() && list.get(i).equals("+")){
                cal(list, i, "+");
                i = 0;
            }else if(i < list.size() && list.get(i).equals("-")){
                cal(list, i, "-");
                i = 0;
            }
        }

        return Integer.parseInt(list.get(0));
    }

    public static void cal(List<String> list, int i, String symbol){
        if(symbol.equals("*")){
            list.set(i, String.valueOf(Integer.parseInt(list.get(i  - 1)) * Integer.parseInt(list.get(i + 1))));
        }else if(symbol.equals("/")){
            list.set(i, String.valueOf(Integer.parseInt(list.get(i  - 1)) / Integer.parseInt(list.get(i + 1))));
        }else if(symbol.equals("+")){
            list.set(i, String.valueOf(Integer.parseInt(list.get(i  - 1)) + Integer.parseInt(list.get(i + 1))));
        }else if(symbol.equals("-")){
            list.set(i, String.valueOf(Integer.parseInt(list.get(i  - 1)) - Integer.parseInt(list.get(i + 1))));
        }
        list.remove(i - 1);
        list.remove(i);
    }
}
