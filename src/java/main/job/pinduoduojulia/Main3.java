package main.job.pinduoduojulia;


import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            //System.out.println(a[i]);
        }
        /*int []a={1,4,998,995};
        int l=1000;
        int n=4;*/
        System.out.println(MoveZhu(a,l,n));

    }
    public static int MoveZhu(int [] a,int l,int n){
        if (n<=1) return 0;
        int result=0;
        Arrays.sort(a);
        int min=Integer.MAX_VALUE;
        int imin=n;
        int [][]d=new int[n][n];
        for(int i=0;i<n;i++){
            d[i][i]=0;
            for(int j=0;j<i;j++){
                d[i][j]=Math.min((a[i]-a[j]),(l-a[i]+a[j]));
                d[j][i]=d[i][j];
            }
        }
        int []s=new int[n];
        for(int i=0;i<n;i++){
            s[i]=0;
            for(int j=0;j<n;j++){
                s[i]=s[i]+d[i][j];
            }
            if (s[i]<min){
                min=s[i];
                imin=i;
            }
        }
        if (imin==n){
            return 0;
        }
        int k=0;
        int minus=0;
        if(n%2==0){
            k=(n-1)/2;
            minus=k*(k+1)+k+1;
        } else{
            k=n/2;
            minus=k*(k+1);
        }
        result=min-minus;
        return result;
    }
}
