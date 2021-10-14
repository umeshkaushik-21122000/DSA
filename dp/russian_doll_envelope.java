import java.io.*;
import java.util.*;

class russian_doll_envelope{
    public static class pair implements Comparable<pair>{
        int i;
        int j;
        public pair(int i,int j){
            this.i=i;
            this.j=j;
        }
        public int compareTo(pair o){
            if(this.i!=o.i)
                return this.i-o.i;
            else return this.j-o.j;
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(f.readLine());
        pair [] arr=new pair[n];
        for(int a=0;a<n;a++){
            String []s=f.readLine().split(" ");
            arr[a]=new pair(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
        }
        Arrays.sort(arr);
        int []dp=new int[n];
        int tmax=0;
        for(int i=0;i<n;i++){
            int count=0;
            int num=arr[i].j;
            for(int j=0;j<i;j++){
                if(arr[j].j<=num){
                    count=Math.max(dp[j],count);
                }
            }
            dp[i]=1+count;
            tmax=Math.max(tmax,dp[i]);
        }
        System.out.println(tmax);
    }

}
