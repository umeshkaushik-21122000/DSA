
import java.util.Scanner;
public class buy_and_sell_stocks_k_transaction_allowed {
    public static void main(String [] args){
        Scanner my=new Scanner(System.in);
        int m=my.nextInt();
        int []a=new int [m];
        for(int i=0;i<a.length;i++){
            a[i]=my.nextInt();
        }
        int tr=my.nextInt();
     int [][]dp=new int[tr+1][a.length];
     for(int t=1;t<=tr;t++){
         int max=Integer.MIN_VALUE;
         for(int d=1;d<a.length;d++){
             if(dp[t-1][d-1]-a[d-1]>max){
                 max=dp[t-1][d-1]-a[d-1];
             }
             dp[t][d] = Math.max(max + a[d], dp[t][d - 1]);
         }
     }
        System.out.println(dp[tr][a.length-1]);

    }

}
