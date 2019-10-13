package main.leecode;

import java.util.LinkedList;
import java.util.List;

public class Solution_797 {

    public List<List<Integer>> totalList = new LinkedList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<Integer> temp = new LinkedList<>();
        temp.add(0);
        helper(graph, 0, graph.length, temp);
        return totalList;


    }

    public void helper(int[][] graph, int index, int n, List<Integer> temp){
        if(index == n - 1){
            totalList.add(new LinkedList(temp));
        }else{
            for(int i = 0; i < graph[index].length; i++){
                temp.add(graph[index][i]);
                helper(graph, graph[index][i], n, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
