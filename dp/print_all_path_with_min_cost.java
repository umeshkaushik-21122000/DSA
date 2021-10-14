import java.io.*;
import java.util.*;

public class print_all_path_with_min_cost{
    private static class pair {
        String psf;
        int i;
        int j;

        public pair(String psf, int i, int j) {
            this.psf = psf;
            this.i = i;
            this.j = j;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(str.split(" ")[j]);
            }
        }

        int [][]dp=new int[n][m];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(i==n-1&&j==m-1){
                    dp[i][j]=arr[i][j];
                }
                else if(i==n-1) {
                    dp[i][j] = dp[i][j + 1] + arr[i][j];
                }
                else if(j==m-1) {
                    dp[i][j] = arr[i][j] + dp[i + 1][j];
                }
                else{
                    dp[i][j]=arr[i][j]+Math.min(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        System.out.println(dp[0][0]);
        Stack<pair>x=new Stack<>();
        x.add(new pair("",0,0));
        while(x.size()>0){
            pair rem=x.pop();
            // System.out.println(dp[rem.i][rem.j]+" this is being removed");
            int a=Integer.MAX_VALUE;
            int b=Integer.MAX_VALUE;
            if(rem.i==n-1&&rem.j==m-1){
                System.out.println(rem.psf);
                continue;
            }
            else if(rem.i<n-1&&rem.j<m-1){
                a=dp[rem.i+1][rem.j];
                b=dp[rem.i][rem.j+1];
                //   System.out.println("the value of a and b is"+a+"   "+b);
            }
            else if(rem.i==n-1&&rem.j<m-1){
                b=dp[rem.i][rem.j+1];
                //    System.out.println("the value of a and b is"+a+"   "+b);

            }
            else if(rem.j==m-1&&rem.i<n-1){
                a=dp[rem.i+1][rem.j];
                // System.out.println("the value of a and b is"+a+"   "+b);
            }
            if(a>b){
                x.push(new pair(rem.psf+"H",rem.i, rem.j+1));
            }
            else if(a<b){
                x.push(new pair(rem.psf+"V",rem.i+1, rem.j));
            }
            else{
                x.push(new pair(rem.psf+"H",rem.i,rem.j+1));
                x.push(new pair(rem.psf+"V",rem.i+1, rem.j ));

            }
        }

    }

}
