package main.school2019Test.xiaomi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 比赛名次
 * 有N个比赛队（1<=N<=500），编号依次为1，2，3，。。。。，N进行比赛，比赛结束后，裁判委员会要将所有参赛队伍从前往后依次排名，
 * 但现在裁判委员会不能直接获得每个队的比赛成绩，只知道每场比赛的结果，即P1赢P2，用P1，P2表示，排名时P1在P2之前。现在请你编程序确定排名。
 * solution1
 * 递归
 * 先搞定之后的名次，再看返回的个数为n还是n - 1， 还是n - 2
 * n,也就是只要查看剩余两个队伍的名次是否正确
 * n - 1，找到存在的队伍，将另外一个插入其前面或者后面
 * n - 2，就是随便插了，只要最小即可
 * solution2
 * 和递归差不多
 * 每次插入一个队伍
 * 分为三种情况
 * 数组中已有重复的2个队伍
 * 数组中已有重复的1个队伍
 * 数组中没有任何重复的队伍
 * solution3
 * 图的想法，先找到一个没有显式输过的队伍，并且编号最小，输出，并且将和这个队伍有关的比赛结果删除
 * 重复知道为空，这时候可能点数不满足要求，需要增加几个没有输出过的元素
 */
public class Solution_85 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][n];

            for(int i = 0; i < m; i++){
                int team1 = sc.nextInt();
                int team2 = sc.nextInt();

                matrix[team1 - 1][team2 - 1] = 1;
            }

            helper3(matrix);
            System.out.println();
        }



    }

//    public static void helper2(){
//        while(sc.hasNext()){
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            List<Integer> list = new ArrayList<>();
//
//            for(int i = 0; i < m; i++){
//                int team1 = sc.nextInt();
//                int team2 = sc.nextInt();
//                int index1 = -1;
//                int index2 = -1;
//
//                if(list.contains(team1)){
//                    index1 = list.indexOf(team1);
//                }
//
//                if(list.contains(team2)){
//                    index2 = list.indexOf(team2);
//                }
//
//                if(index1 == -1 && index2 == -1){
//                    int flag = -1;
//                    for(int j = 0; j < list.size(); j ++){
//                        if(list.get(j) > team1){
//                            list.add(j, team1);
//                            flag = j + 1;
//                            break;
//                        }
//                    }
//
//                    if(flag == -1){
//                        list.add(team1);
//                        flag = 1;
//                    }
//
//                    for(int j = flag; j < list.size(); j++){
//                        if(list.get(j) > team2){
//                            list.add(j, team2);
//                            flag = -1;
//                            break;
//                        }
//                    }
//
//                    if(flag != -1){
//                        list.add(team2);
//                    }
//                }else if(index1 == -1 && index2 != -1){
//                    int j;
//                    for(j = 0; j < index2; j++){
//                        if(list.get(j) > team1){
//                            list.add(j, team1);
//                            break;
//                        }
//                    }
//
//                    if(j >= index2){
//                        list.add(index2, team1);
//                    }
//                }else if(index1 != -1 && index2 == -1){
//                    int j;
//                    for(j = index1 + 1; j < list.size(); j ++){
//                        if(list.get(j) > team2){
//                            list.add(j, team2);
//                            break;
//                        }
//                    }
//                    if(j >= list.size()){
//                        list.add(team2);
//                    }
//                }else{
//                    if(index1 > index2){
//                        int tmp = list.get(index1);
//                        list.set(index1, list.get(index2));
//                        list.set(index2, tmp);
//                    }
//                }
//            }
//
//            for(int i = 0; i < list.size(); i++){
//                System.out.print(list.get(i) + " ");
//            }
//            System.out.println();
//        }
//    }

    public static void helper3(int[][] matrix){

        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int[] flag = new int[n];
        boolean index = true;

        while(index){
            index = false;
            for(int i = 0; i < n; i ++){
                if(flag[i] == 0){
                    int j;
                    for(j = 0; j < n; j++){
                        if(matrix[j][i] != 0){
                            break;
                        }
                    }
                    if(j >= n){
                        list.add(i);
                        flag[i] ++;
                        index = true;
                        for(j = 0;j < n; j ++){
                            matrix[i][j] = 0;
                        }
                        break;
                    }
                }
            }
        }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + 1 + " ");
        }
        for(int i = 0; i < n; i++){
            if(flag[i] == 0){
                System.out.print(i + 1 + " ");
            }
        }

    }
}
