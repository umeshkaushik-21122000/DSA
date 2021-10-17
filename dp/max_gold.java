import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public  class max_gold {
    public static class pair{
        int i;
        int j;
        String psf;
        public  pair(int i,int j,String psf){
            this.i=i;
            this.j=j;
            this.psf=psf;
        }
    }
    public static void main(String [] args ){
        Scanner m=new Scanner(System.in);
        int n=m.nextInt();
        int mm=m.nextInt();
        int [][]arr=new int[n][mm];
        for(int i=0;i<n;i++)
            for(int j=0;j<mm;j++)
                arr[i][j]=m.nextInt();
            int [][]dp=new int[n][mm];
            for(int i=mm-1;i>=0;i--)
                for(int j=0;j<n;j++)
                    if(i==mm-1) dp[j][i]=arr[j][i];
                    else if(j==0) dp[j][i]=Math.max(dp[j][i+1],dp[j+1][i+1])+arr[j][i];
                    else if(j==n-1) dp[j][i]=Math.max(dp[j][i+1],dp[j-1][i+1])+arr[j][i];
                    else dp[j][i]=Math.max(dp[j][i+1],Math.max(dp[j+1][i+1],dp[j-1][i+1]))+arr[j][i];

                    Queue<pair> x=new ArrayDeque<>();
                    int max=-1;
                    for(int i=0;i<n;i++)
                        max=Math.max(max,dp[i][0]);
                   for(int i=0;i<n;i++)
                       if(dp[i][0]==max)
                           x.add(new pair(i,0,""+i+" "));
                       while(x.size()>0){
                           pair rem=x.remove();
                               int d1=-1;
                               int d2=-1;
                               int d3=-1;
                               if(rem.j==mm-1){
                                   System.out.println(rem.psf);
                               }
                          else {
                               if(rem.i==0){
                                   d2=dp[rem.i][rem.j+1];
                                   d3=dp[rem.i+1][rem.j+1];
                               }
                               else if(rem.i==n-1){
                                   d2=dp[rem.i][rem.j+1];
                                   d1=dp[rem.i-1][rem.j+1];
                               }
                               else{
                                   d2=dp[rem.i][rem.j+1];
                                   d1=dp[rem.i-1][rem.j+1];
                                   d3=dp[rem.i+1][rem.j+1];
                               }
                             int cmax=Math.max(d1,Math.max(d2,d3));
                               if(cmax==d1)
                                   x.add (new pair(rem.i-1,rem.j+1,rem.psf+"d1 "));
                               if(cmax==d2)
                                   x.add (new pair(rem.i,rem.j+1,rem.psf+"d2 "));
                               if(cmax==d3)
                                   x.add (new pair(rem.i+1,rem.j+1,rem.psf+"d3 "));
                           }

                       }
    }
}
