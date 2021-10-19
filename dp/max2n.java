import java.util.Scanner;

public class max2n {
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int n= my.nextInt();
        int [][]a=new int[2][n];
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                a[i][j]=my.nextInt();
            }
        }
        int [][]dp=new int[2][n];
        int x=add(dp,0,a);
        System.out.println(x);
    }
    public static int add(int [][]dp,int n,int [][]a){
        if(n>=a[0].length) {
            return 0;
        }
        int l=add(dp,n+2,a);
        int k=add(dp,n+2,a);
        int t=Math.max(l,k);
        dp[0][n]=a[0][n]+t;
        dp[1][n]=a[1][n]+t;
    return Math.max(dp[0][n],dp[1][n]);}
}
