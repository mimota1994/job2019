package main.school2019Test.kuaishou;

import java.io.IOException;
import java.util.Scanner;


//字符串包含
public class Solution_27 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            String l=scan.nextLine();
            String[] str=l.split(" ");
            String strA=str[0];
            String strB=str[1];
            if(strA.length() > strB.length()){
                System.out.println(subString(strA, strB));
            }else{
                System.out.println(subString(strB, strA));
            }

        }
    }

    public static int subString(String father, String son){
        char[] charFa = father.toCharArray();
        char[] charSon = son.toCharArray();

        for(int i = 0; i < charFa.length - son.length() + 1; i++){
            int index_fa = i;
            int j = 0;
            for(; j < charSon.length; j++){
                if(charFa[index_fa] == charSon[j]){
                    index_fa ++;
                }else{
                    break;
                }
            }
            if(j >= charSon.length){
                return 1;
            }
        }
        return 0;
    }

}
