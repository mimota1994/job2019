package main.school2019Test.wangyi;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//表达式求值
public class Solution_13 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);
        int c = Integer.parseInt(strs[2]);

        if(a > 0 && b > 0 && c > 0){
            if(a == 1 && b == 1 && c == 1){
                System.out.println(3);
            }else if(a == 1 || b == 1 || c == 1){
                int max = 0;
                if((a + b) * c > max){
                    max = (a + b) * c;
                }
                if((a + c) * b > max){
                    max = (a + c) * b;
                }
                if((b + c) * a > max){
                    max = (b + c) * a;
                }
                System.out.println(max);
            }else{
                System.out.println(a * b * c);
            }

        }else if(a * b * c > 0){
            if(a == 1 || b == 1 || c == 1){
                System.out.println(a * b * c + 1);
            }else{
                System.out.println(a * b * c);
            }
        }else if(a * b > 0){
            System.out.println(a + b + c);
        }

    }
}
