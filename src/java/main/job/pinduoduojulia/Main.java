package main.job.pinduoduojulia;

import java.util.Scanner;

public class Main {
    static boolean[] visited;
    static int nv;
    static int ne;
    static int[][]edge;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nv=sc.nextInt();
        ne=sc.nextInt();
        edge=new int[nv][nv];
        for(int i=0;i<ne;i++){
            int t=sc.nextInt();
            int k=sc.nextInt();
            edge[t-1][k-1]=1;
            edge[k-1][t-1]=1;
            
        }
        int count=1;

        visited=new boolean[nv];
        for(int t=0;t<nv;t++){
            if(visited[t]==false){
                count++;
                dfs(t);
            }
        }
        if(ne==0){
            count=nv;
        }
        System.out.println(count);

    }
    public static void dfs(int i){
        visited[i]=true;
        for(int j=0;j<nv;j++){
            if(visited[j]==false && edge[i][j]==1){
                dfs(j);
            }
        }
    }


}
