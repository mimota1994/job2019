package main.job.pinduoduojulia;


import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        long sum=0;
        for(int i=1;i<=s;i++){
            sum+=(helper(1,i,n,s) % 1000000007);
        }
        System.out.println(sum);

    }
    public static long helper(int i,int k,int n,int s){
        if(i==n){
            if(k==s){
                return 1;
            } else{
                return 0;
            }
        } else if(s< k){
            return 0;
        }  else{
            long sum=0;
            for(int j=k+1;j<=s;j++){
                sum+=(helper(i+1,j,n,s-k)%1000000007);
            }
            return sum;
        }
    }
}
