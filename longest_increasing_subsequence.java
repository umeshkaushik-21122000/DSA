import java.util.Scanner;

public class longest_increasing_subsequence {
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int a=my.nextInt();
        int []arr=new int[a];
        for(int i=0;i<arr.length;i++)
            arr[i]=my.nextInt();
        int  []dp=new int[arr.length];
        dp[arr.length-1]=1;
        int mmax=1;
        for(int i=arr.length-2;i>=0;i--){
            int max=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    max=Math.max(max,dp[j]);
                }
            }
            dp[i]=max+1;
            mmax=Math.max(mmax,dp[i]);
        }
        System.out.println(mmax);

    }

}