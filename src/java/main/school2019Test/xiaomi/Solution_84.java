package main.school2019Test.xiaomi;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ipv4地址白名单
 * 我们的小齐同学是一名很辛苦的实习DBA，他每天的工作就是为一个帐号添加授权，今天给这200个ipv4添加授权，明天又要把这200个授权删掉，
 * 有一天小齐同学在删除授权的时候不小心把所有的授权都删了，被领导很批了一顿。痛定思痛，小齐同学开始反思他每天的工作，发现无非就是我每天要让那些ip访问数据库而已，
 * 他决定写一个效率很高的ip白名单，请帮小齐同学说一下实现思路，并用结构化编程语言（c/c++/python/golang/java等）写一个ip白名单吧，
 * 他需要这个白名单有添加ip的功能，删除ip的功能，查找这个ip在不在白名单中，以及打印白名单中的内容，以上四个功能中查找ip是否在白名单中效率一定要高。
 * 并帮小齐分析一下各个功能的时间复杂度，写的好小齐同学会请你吃饭哦。
 * solution1
 * 用一个set来保存当前的ip白名单
 */
public class Solution_84 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Set<String> set = new HashSet<>();
        while(!"end".equals(str)){
            String[] strs = str.split(":");
            if("i".equals(strs[0])){
                set.add(strs[1]);
                System.out.println("ok");
            }else if("s".equals(strs[0])){
                if(set.contains(strs[1])){
                    System.out.println(true);
                }else{
                    System.out.println(false);
                }
            }else{
                set.remove(strs[1]);
                System.out.println("ok");
            }

            str = sc.nextLine();
        }
    }
}
