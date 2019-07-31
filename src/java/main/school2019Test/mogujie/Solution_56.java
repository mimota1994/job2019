package main.school2019Test.mogujie;

import java.util.Scanner;

//括号匹配问题
public class Solution_56 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.nextLine().toCharArray();

        char[] stack = new char[array.length];
        int top = -1;
        for(int i = 0; i < array.length; i++) {
            if (array[i] == '[' || array[i] == '(') {
                stack[++top] = array[i];
            } else if (array[i] == ']' || array[i] == ')') {
                if (top < 0) {
                    System.out.println(false);
                    return;
                } else if (array[i] == ']') {
                    if (stack[top] != '[') {
                        System.out.println(false);
                        return;
                    } else {
                        top--;
                    }
                } else if (array[i] == ')') {
                    if (stack[top] != '(') {
                        System.out.println(false);
                        return;
                    } else {
                        top--;
                    }
                }
            }
        }

        System.out.println(true);
    }
}