package main.job.pinduoduojulia;


import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        double min=Double.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            double f=helper(array[i],array[i+1],array[i+2]);
            if(f<min){
                min=f;
            }
        }
        System.out.format("%.2f",min);
    }
    public static double helper(int a,int b,int c){
        double aver=(a+b+c)/(3.0);
        return ((a-aver)*(a-aver)+(b-aver)*(b-aver)+(c-aver)*(c-aver))/3;
    }
}
