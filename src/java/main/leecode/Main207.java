package main.leecode;

import java.util.LinkedList;
import java.util.List;

/**
 * 现在你总共有 n 门课需要选，记为 0 到 n-1。
 *
 * 在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们: [0,1]
 * 给定课程总量以及它们的先决条件，判断是否可能完成所有课程的学习？
 * solution1:
 * 拓扑排序，暴力，n3，超时
 *
 * solution2：
 * 拓扑排序，利用队列保存需要执行，也就是入度为0的元素，数组记录每个元素的入度，动态更新数值
 * 假如存在新的度为0的的元素，加入队列中

 */
public class Main207 {

    public static void main(String[] args) {
        int numC = 2;
        int[][] pre = new int[][]{new int[]{1,0}};
        System.out.println(canFinish2(numC, pre));
    }

    public boolean canFinish1(int numCourses, int[][] prerequisites) {
        int[] v = new int[numCourses];
        int[][] matrix = new int[numCourses][numCourses];
        for(int i = 0; i < prerequisites.length; i++){
            matrix[prerequisites[i][1]][prerequisites[i][0]] = 1;
        }

        boolean flag = false;
        while(true){
            flag = false;
            for(int j = 0; j < numCourses; j++){
                if(v[j] == 0){
                    int i = 0;
                    for(; i < numCourses; i++){
                        if(matrix[i][j] == 1){
                            break;
                        }
                    }
                    if(i < numCourses){
                        continue;
                    }else{
                        v[j] = 1;
                        flag = true;
                        for(int k = 0; k < numCourses; k ++){
                            matrix[j][k] = 0;
                        }
                    }
                }else{
                    continue;
                }
            }

            if(flag == true){
                continue;
            }else{
                break;
            }
        }

        for(int i = 0; i < v.length; i++){
            if(v[i] == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean canFinish2(int numCourses, int[][] prerequisites){
        int[] v = new int[numCourses];  //保存出度，入度由矩阵保存
        int[][] matrix = new int[numCourses][numCourses];
        for(int i = 0; i < prerequisites.length; i++){
            matrix[prerequisites[i][1]][prerequisites[i][0]] = 1;
            v[prerequisites[i][0]] ++;
        }

        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < numCourses; i++){
            if(v[i] == 0){
                list.add(i);
            }
        }

        while(!list.isEmpty()){
            int node = list.poll();
            for(int i = 0; i < numCourses; i++){
                if(matrix[node][i] == 1){
                    v[i] --;
                    if(v[i] == 0){
                        list.add(i);
                    }
                    matrix[node][i] = 0;
                }
            }
        }
        for(int i = 0; i < numCourses; i++){
            if(v[i] > 0){
                return false;
            }
        }
        return true;
    }
}
