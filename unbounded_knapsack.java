
import java.util.*;
public class unbounded_knapsack{

    public static void main(String[] args) throws Exception {
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        int []a=new int[n];
        int []b=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=my.nextInt();
        }
        for(int i=0;i<a.length;i++){
            b[i]=my.nextInt();
        }
        int cap=my.nextInt();
        unbounded(a,b,cap);
    }
    public static void unbounded(int []a,int[]b,int tar){
        int [][]dp=new int[a.length+1][tar+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(j>=b[i-1]){
                    int div=j/b[i-1];
                    int remainder=j%b[i-1];
                    int res=div*a[i-1]+dp[i-1][remainder];

                    if(dp[i-1][j]>res){
                        dp[i][j]=dp[i-1][j];
                    }
                    else{
                        dp[i][j]=res;
                    }
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }

            }
        }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+"\t");
            }
            System.out.println();
        }
    }
}