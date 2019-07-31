package main.school2019Test.mogujie;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//possible
//递归，利用list来保存下一级的可能性
//测试用例有点问题，没有考虑到排列顺序
public class Solution_53 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int start = str.indexOf("=\"");
        str = str.substring(start + 2, str.length() - 1);
        String dic = sc.nextLine();
        start = dic.indexOf("=\"");
        dic = dic.substring(start + 2, dic.length() - 1);
        String[] dict = dic.split("\",\"");

        List<List<String>> totalList = helper(str, dict);
        System.out.print("[");
        boolean isFirst = true;
        for(List<String> list : totalList){
            if(isFirst){
                myPrint(list);
                isFirst = false;
            }else{
                System.out.print(", ");
                myPrint(list);
            }
        }
        System.out.print("]");
    }

    public static void myPrint(List<String> list){
        boolean isFirst = true;
        for(int i = list.size() - 1; i >= 0; i--){
            String str = list.get(i);
            if(isFirst){
                System.out.print(str);
                isFirst = false;
            }else{
                System.out.print(" " + str);
            }
        }
    }

    public static List<List<String>> helper(String str, String[] dict){
        ArrayList<List<String>> totalList = new ArrayList<>();

        if("".equals(str)){
            totalList.add(new ArrayList<String>());
            return totalList;
        }

        for(String word : dict){
            int index = str.indexOf(word);
            if(index == 0){
                List<List<String>> tmp = helper(str.substring(word.length()), dict);
                for(List<String> list : tmp){
                    list.add(word);
                }
                totalList.addAll(tmp);
            }
        }
        return totalList;
    }
}
