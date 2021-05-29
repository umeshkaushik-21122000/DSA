import java.util.*;
public class maximum_sum {
    public static void main(String[] args) throws Exception {
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
         a[i]=my.nextInt();

        }
        int [][]x=new int[2][n+1];
       // allsubset(a);
        int []mem=new int[2];
        int maxLen=n;
        int dp[] = new int[maxLen];
        boolean v[] = new boolean[maxLen];
        int l=maxSum(a,0,n,maxLen,dp,v);
        System.out.println(l);
    }
    public static void allsubset(int []a){

        int include=a[0];
        int exclude=0;

        for(int i=1;i<a.length;i++){
                int ninclude=exclude+a[i];
                int nexclude=Math.max(include,exclude);
        include=ninclude;
        exclude=nexclude;
        }
        int ans=Math.max(include,exclude);
        System.out.println(ans);
} //tabulation
    public static int maxSum(int arr[], int i, int n,int maxLen,int []dp,boolean []v){
        if (i >= n)
            return 0;
        if (v[i])
            return dp[i];
        v[i] = true;
        dp[i] = Math.max(maxSum(arr, i + 1, n,maxLen,dp,v),
                arr[i] + maxSum(arr, i + 2, n,maxLen,dp,v));

        return dp[i];
    }
}
