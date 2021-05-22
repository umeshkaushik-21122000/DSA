/*
5
15 14 10 45 30
2 5 1 3 4
7
 */
import java.util.Scanner;
public class zerooneknackpack {
    public static void main(String[] args){
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        int[]a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=my.nextInt();
        }
        int []b=new int[n];
        for(int i=0;i<b.length;i++){
            b[i]=my.nextInt();
        }
        int tar=my.nextInt();
        dp(a,b,tar);
    }
    public static void dp(int []a, int[]b,int tar){
        int [][]dp=new int[a.length+1][tar+1];
        for(int i=1;i<dp.length;i++){
        for(int j=1;j<dp[0].length;j++){
               if(j>=b[i-1]){
                   int rcap=j-b[i-1];
                   if(dp[i-1][rcap]+a[i-1]>dp[i-1][j]){
                       dp[i][j]=dp[i-1][rcap]+a[i-1];
                   }
                   else{
                       dp[i][j]=dp[i-1][j];
                   }
               }
            else{
                dp[i][j]=dp[i-1][j];
               }
        }
        }


            System.out.println(dp[dp.length-1][dp[0].length-1]);

    }

}
